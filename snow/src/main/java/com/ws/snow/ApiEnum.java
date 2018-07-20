package com.ws.snow;

import com.ws.snow.core.AbstractExecutor;

/**
 * ApiEnum
 *
 * @author wanshou
 * @date 2018/7/4
 */
public enum ApiEnum {

    LOGIN("Login", "LoginExecutor", AbstractExecutor.newPostRequest());

    private String api;
    private String alias;
    private AbstractExecutor.HttpRequest httpRequest;

    ApiEnum(String api, String alias, AbstractExecutor.HttpRequest httpRequest) {
        this.api = api;
        this.alias = alias;
        this.httpRequest = httpRequest;
    }

    public String getApi() {
        return api;
    }

    public String getAlias() {
        return alias;
    }

    public AbstractExecutor.HttpRequest getHttpType() {
        return httpRequest;
    }
}
