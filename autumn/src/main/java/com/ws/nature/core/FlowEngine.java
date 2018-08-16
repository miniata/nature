package com.ws.nature.core;

import com.alibaba.fastjson.JSONArray;
import com.ws.nature.Handle;
import com.ws.nature.util.SpringHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FlowEngine
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class FlowEngine<T extends Enum> {

    private static final List<Context> states = new ArrayList<>();

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
        List<Context> contexts = states.stream()
                .filter(o -> o.getPresent().equals(present.name()) && o.getExpect().equals(expect.name()))
                .collect(Collectors.toList());
        if(contexts == null || contexts.size() == 0){
            throw new RuntimeException("不存在流程："+present+"---->"+expect);
        }
        if(contexts.size() > 1){
            throw new RuntimeException("流程配置："+present+"---->"+expect+",存在2个以上的handle");
        }
        return contexts.get(0);
    }

    private void init(){
        List<Context> contexts = JSONArray.parseArray(CommonConfig.flows, Context.class);
        contexts.forEach(context -> {
            Handle handle = SpringHelper.getBeanByName(context.getHandleName(), Handle.class);
            Handle dsf = new DefaultFlow(handle);
            context.setHandle(dsf);
        });
        states.addAll(contexts);
    }
}
