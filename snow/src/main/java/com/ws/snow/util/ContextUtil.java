package com.ws.snow.util;

import com.ws.snow.Context;

/**
 * ContextUtil
 *
 * @author wanshou
 * @date 2018/7/5
 */
public class ContextUtil {

    public static Context newContext(String request){
        if(request == null || "".equals(request)){
            throw new RuntimeException("request 数据为空！！！");
        }
        return new Context(request);
    }

}
