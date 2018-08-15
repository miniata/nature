package com.ws.nature.core;

import com.ws.nature.Handle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * AutoStateFlow
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class AutoStateFlow extends BaseFlow {

    private State state;

    private List<StandardStateFlow> flowList = new ArrayList<>();

    public AutoStateFlow(Handle handle) {
        super(handle);
    }

    @Override
    protected boolean check() {
        return false;
    }

    @Override
    public Map<String, Object> handle(StandardStateFlow context) {
        return null;
    }

    //AutoStateFlow转换成StandardStateFlow

}
