package com.ws.nature.core;

import com.ws.nature.Handle;

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
    public void handle(Context context) {
        //执行拦截器和监听器
        handle.handle(context);
        //执行监听器
        toNotifyListeners(context);
    }

    @Override
    void toNotifyListeners(Context context) {
        FlowEngine.getListeners().forEach(o -> o.update(context));
    }

}
