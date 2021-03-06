package com.ws.nature.core;

import java.util.HashMap;
import java.util.Map;

/**
 * FlowEngineFactory
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class CommonFactory {

    private static final Map<Class, FlowEngine> map = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static <T extends Enum> FlowEngine<T> newFlowEngine(Class<T> clazz){
        //检验参数
        if(clazz == null){
            throw new RuntimeException("参数错误！");
        }
        if(map.containsKey(clazz)){
            return (FlowEngine<T>)map.get(clazz);
        }
        FlowEngine<T> flowEngine = new FlowEngine<>();
        map.put(clazz, flowEngine);
        return flowEngine;
    }

}
