package com.ws.nature.core;

import com.ws.nature.Handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FlowEngine
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class FlowEngine<T> {

    private final List<T> states = new ArrayList<>();

    private final List<Handle> handles = new ArrayList<>();

    private final Map<Handle, StandardStateFlow> baseFlowMap = new HashMap<>();

    public FlowEngine() {
        init();
    }

    private void init(){

    }
}
