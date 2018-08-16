package com.ws.nature.core;

import com.ws.nature.Handle;

import java.util.Map;

/**
 * Context
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class DefaultStateFlow extends BaseFlow {

    public DefaultStateFlow(Handle handle) {
        super(handle);
    }

    @Override
    public Map<String, Object> handle(Context context) {
        //执行拦截器和监听器
        Map<String, Object> result = handle.handle(context);
        return result;
    }
}
