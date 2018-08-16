package com.ws.nature.core;

import com.ws.nature.Handle;

import java.util.Map;

/**
 * DefaultFlow为Handle操作类的默认装饰类
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class DefaultFlow extends BaseFlow {

    public DefaultFlow(Handle handle) {
        super(handle);
    }

    @Override
    public Map<String, Object> handle(Context context) {
        //执行拦截器和监听器
        Map<String, Object> result = handle.handle(context);
        return result;
    }
}
