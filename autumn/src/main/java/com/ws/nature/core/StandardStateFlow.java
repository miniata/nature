package com.ws.nature.core;

import com.ws.nature.Handle;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Context
 *
 * @author wanshou
 * @date 2018/8/15
 */
public class StandardStateFlow extends BaseFlow {

    private State preState;

    private State nextState;

    private StandardStateFlow(String preState, String nextState, Handle handle) {
        super(handle);
        this.preState = State.of(preState);
        this.nextState = State.of(nextState);
    }

    public State getPreState() {
        return preState;
    }

    public State getNextState() {
        return nextState;
    }

    public StandardStateFlow newStandardStateFlow(String preState, String nextState){
        if(StringUtils.isBlank(preState) || StringUtils.isBlank(nextState)){
            throw new RuntimeException("参数不能为空！");
        }
        if(!check()){
            throw new RuntimeException("节点状态："+preState+"-->"+nextState+" 找不到对应的处理器！");
        }
        //检验状态是否合法
        Handle handle = null;
        return new StandardStateFlow(preState, nextState, handle);
    }


    @Override
    public Map<String, Object> handle(StandardStateFlow context) {
        return null;
    }

    @Override
    protected boolean check() {
        return false;
    }
}
