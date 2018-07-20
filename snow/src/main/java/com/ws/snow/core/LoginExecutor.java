package com.ws.snow.core;

import com.ws.snow.Context;

/**
 * LoginApiExecutor
 *
 * @author wanshou
 * @date 2018/7/3
 */
public class LoginExecutor extends AbstractExecutor {

    @Override
    public <T> T execute(Context context) {
        context.getHttpRequest().request();
        T result = null;
        return result;
    }

}
