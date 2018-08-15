package com.ws.nature.core;

import com.ws.nature.Handle;

/**
 * BaseFlow
 *
 * @author wanshou
 * @date 2018/8/15
 */
public abstract class BaseFlow implements Handle {

    private Handle handle;

    public BaseFlow(Handle handle) {
        this.handle = handle;
    }

    /**
     * 判断用户传入的handle是否合法
     * @return
     */
    protected abstract boolean check();
}
