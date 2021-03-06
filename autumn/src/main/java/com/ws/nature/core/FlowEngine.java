package com.ws.nature.core;

import com.alibaba.fastjson.JSONArray;
import com.ws.nature.Handle;
import com.ws.nature.plugin.HandleInterceptor;
import com.ws.nature.plugin.HandleListener;
import com.ws.nature.util.SpringHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * FlowEngine
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class FlowEngine<T extends Enum> {

    private static final List<Context> contexts = new ArrayList<>();

    private static final List<HandleListener> listeners = new ArrayList<>();

    private static final List<HandleInterceptor> interceptors = new ArrayList<>();

    FlowEngine() {
        init();
    }

    /**
     * 通过两个节点状态获取到对应的流转上下文
     * @param present
     * @param expect
     * @return
     */
    public Context getContext(T present, T expect){
        if(present == null || expect == null){
            throw new RuntimeException("参数 present："+present+"、expect："+expect+",一个都不能为空");
        }
        List<Context> contextList = contexts.stream()
                .filter(o -> o.getPresent().equals(present.name()) && o.getExpect().equals(expect.name()))
                .collect(Collectors.toList());
        if(contextList == null || contextList.size() == 0){
            throw new RuntimeException("不存在流程："+present+"---->"+expect);
        }
        if(contextList.size() > 1){
            throw new RuntimeException("流程配置："+present+"---->"+expect+",存在2个以上的handle");
        }
        return contextList.get(0);
    }

    private void init(){
        //初始化流程节点上下文
        List<Map> contextList = JSONArray.parseArray(CommonConfig.flows, Map.class);
        //初始化上下文处理器
        contextList.forEach(map -> {
            String handleName = String.valueOf(map.get("handleName"));
            String present = String.valueOf(map.get("present"));
            String expect = String.valueOf(map.get("expect"));
            Handle handle = SpringHelper.getBeanByName(handleName, Handle.class);
            Handle defaultFlow = new DefaultFlow(handle);
            Context context =  Context.newContextBuilder(present, expect)
                    .handleName(handleName)
                    .handle(defaultFlow)
                    .build();
            contexts.add(context);
        });
        //初始化监听器
        List<String> handleListenerList = JSONArray.parseArray(CommonConfig.listeners, String.class);
        handleListenerList.forEach(listenerName -> {
            HandleListener handleListener = SpringHelper.getBeanByName(listenerName, HandleListener.class);
            listeners.add(handleListener);
        });
        //初始化拦截器
        interceptors.add(null);
    }

    static List<HandleListener> getListeners() {
        return listeners;
    }
}
