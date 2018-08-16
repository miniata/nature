package com.ws.nature.core;

import com.ws.nature.Handle;

import java.util.Map;

/**
 * Context
 *
 * @author wanshou
 * @date 2018/8/16
 */
public class Context {

    /**
     * 当前节点状态
     */
    private String present;

    /**
     * 期待达到的状态
     */
    private String expect;

    private Integer result = 0;

    private String success = "状态流转到成功";

    private String fail = "状态流转失败";

    private String handleName = "DefaultHandle";

    private Handle handle = null;

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public Map<String, Object> toHandle(){
        return this.getHandle().handle(this);
    }
}
