package com.ws.nature.core;

/**
 * State
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class State {

    private String state;

    private State(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public static State of(String state){
        return new State(state);
    }
}
