package com.ws.snow.core;


import com.ws.snow.Context;

/**
 * ApiExecutor
 *
 * @author wanshou
 * @date 2018/7/3
 */
public interface Executor {

    /**
     * 处理具体的请求
     * @param context
     * @param <T>
     * @return
     */
    <T> T execute(Context context);

}
