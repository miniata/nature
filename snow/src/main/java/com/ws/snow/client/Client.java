package com.ws.snow.client;

import com.ws.snow.ApiEnum;
import com.ws.snow.Context;
import com.ws.snow.util.ContextUtil;

/**
 * ApiClient
 *
 * @author wanshou
 * @date 2018/7/3
 */
class Client extends AbstractClient {

    Client(){}

    @Override
    protected Context parseXml(String data) {
        Context context = ContextUtil.newContext(data);
        //解析xml文件
        internalParseXml(context);
        return context;
    }

    @Override
    protected boolean checkApiExist(String api, Context context) {
        boolean result = false;
        if(api == null || "".equals(api)){
            return result;
        }
        ApiEnum[] apiEnums = ApiEnum.values();
        for (ApiEnum apiEnum : apiEnums){
            if(api.equals(apiEnum.getApi())){
                context.setApi("");
                result = true;
                break;
            }
        }
        return result;
    }

    private void internalParseXml(Context context){

    }
}
