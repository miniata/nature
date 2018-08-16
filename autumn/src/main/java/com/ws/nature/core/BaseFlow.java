package com.ws.nature.core;

import com.ws.nature.Handle;

/**
 * BaseFlow为Handle包装类的转发类
 *
 * @author wanshou
 * @date 2018/8/15
 */
public abstract class BaseFlow implements Handle {

    protected Handle handle;

    public BaseFlow(Handle handle) {
        this.handle = handle;
    }

}
