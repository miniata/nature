package com.ws.snow;

import com.ws.snow.core.AbstractExecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * Context
 *
 * @author wanshou
 * @date 2018/7/5
 */
public class Context {

    private String api;

    private AbstractExecutor.HttpRequest httpRequest;

    private String request;

    private String response;

    private final Map<String, Object> requestData = new HashMap<>();

    private final Map<String, Object> responseData = new HashMap<>();

    public Context(String request){
        this.request = request;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public AbstractExecutor.HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(AbstractExecutor.HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Map<String, Object> getRequestData() {
        return requestData;
    }

    public Map<String, Object> getResponseData() {
        return responseData;
    }
}
