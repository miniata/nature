package com.ws.snow.client;

/**
 * IClient
 *
 * @author wanshou
 * @date 2018/7/20
 */
public interface IClient {

    /**
     * 执行API的客户端
     * @param data
     * @param <T>
     * @return
     */
    <T> T executeApi(String data);

}
