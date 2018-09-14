package com.ws.nature.runner;

import com.ws.nature.IServiceRunner;

/**
 * 日志存储服务
 *
 * @author wanshou
 * @date 2018/9/13
 */
public class StoreRunner implements IServiceRunner {


    @Override
    public boolean start() throws Throwable {
        return false;
    }

    @Override
    public boolean stop() throws Throwable {
        return false;
    }

    @Override
    public boolean isRunning() throws Throwable {
        return false;
    }
}
