package com.ws.nature.core;

import com.ws.nature.Handle;

/**
 * BaseFlow为Handle包装类的转发类
 *
 * @author wanshou
 * @date 2018/8/15
 */
public abstract class BaseFlow implements Handle {

    Handle handle;

    BaseFlow(Handle handle) {
        this.handle = handle;
    }

    /**
     * 执行完handle通知监听
     * @param context
     */
    abstract void toNotifyListeners(Context context);

}
