package com.ws.snow;

import com.ws.snow.client.ClientFactory;
import com.ws.snow.client.IClient;
import org.junit.Test;

/**
 * ClientTest
 *
 * @author wanshou
 * @date 2018/7/20
 */
public class ClientTest {

    @Test
    public void testNewClient(){
        IClient client = ClientFactory.INSTANCE.newClient();
        client.executeApi("");
    }

}
