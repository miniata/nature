package com.ws.nature.core;

import com.ws.nature.Handle;

/**
 * BaseFlow
 *
 * @author wanshou
 * @date 2018/8/15
 */
public abstract class BaseFlow<T> implements Handle {

    protected Handle handle;

    public BaseFlow(Handle handle) {
        this.handle = handle;
    }

}
