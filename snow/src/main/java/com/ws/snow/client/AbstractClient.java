package com.ws.snow.client;

import com.ws.snow.Context;
import com.ws.snow.component.Interceptor;
import com.ws.snow.core.Executor;
import com.ws.snow.core.ExecutorFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractApiClient
 *
 * @author wanshou
 * @date 2018/7/3
 */
public abstract class AbstractClient implements IClient {

    private final List<Interceptor> interceptors = new ArrayList<Interceptor>();

    @Override
    public <T> T executeApi(String data){
        //解析xml文件
        Context context = parseXml(data);
        //判断api是否存在
        if(!checkApiExist(context.getApi(), context)){
            throw new RuntimeException("api非法不存在！！！");
        }
        //获取Executor
        Executor executor = ExecutorFactory.INSTANCE.newExecutor(context.getApi());
        //调用拦截器
        return executor.execute(context);
    }

    /**
     * 转换xml文件为Map
     * @param data
     * @return
     */
    protected abstract Context parseXml(String data);

    /**
     * 判断api是否存在
     * @param api
     * @param context
     * @return
     */
    protected abstract boolean checkApiExist(String api, Context context);

}
