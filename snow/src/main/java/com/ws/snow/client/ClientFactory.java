package com.ws.snow.client;

/**
 * ClientFactory
 *
 * @author wanshou
 * @date 2018/7/5
 */
public enum  ClientFactory {

    INSTANCE;

    public AbstractClient newClient(){
        return new Client();
    }

}
