package com.ws.nature.core;

import com.ws.nature.DefaultHandle;
import com.ws.nature.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * Context
 *
 * @author wanshou
 * @date 2018/8/16
 */
public class Context{

    /**
     * 当前节点状态
     */
    private String present;

    /**
     * 期待达到的状态
     */
    private String expect;

    /**
     * 执行器名字
     */
    private String handleName;

    /**
     * 执行器实例
     */
    private Handle handle;

    private Map<String, Object> result = new HashMap<>();

    public Context(Builder builder) {
        this.present = builder.present;
        this.expect = builder.expect;
        this.handle = builder.handle;
        this.handleName = builder.handleName;
    }

    public String getPresent() {
        return present;
    }

    public String getExpect() {
        return expect;
    }

    public String getHandleName() {
        return handleName;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void toHandle(){
        handle.handle(this);
    }

    public static class Builder {

        private String present;
        private String expect;
        private String handleName;
        private Handle handle;

        public Builder(String present, String expect) {
            this.present = present;
            this.expect = expect;
        }

        public Builder handleName(String handleName){
            this.handleName = handleName;
            return this;
        }

        public Builder handle(Handle handle){
            this.handle = handle;
            return this;
        }

        public Context build(){
            return new Context(this);
        }
    }

    static Builder newContextBuilder(String present, String expect){
       return new Builder(present, expect);
    }
}
