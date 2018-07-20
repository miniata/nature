package com.ws.snow.core;

/**
 * ExecutorFactory
 *
 * @author wanshou
 * @date 2018/7/3
 */
public enum ExecutorFactory {

    INSTANCE;

    public Executor newExecutor(String name){
        return new LoginExecutor();
    };

}
