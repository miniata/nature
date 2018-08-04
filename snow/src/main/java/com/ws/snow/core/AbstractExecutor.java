package com.ws.snow.core;

import java.util.Map;

/**
 * AbstractApiExecuter
 *
 * @author wanshou
 * @date 2018/7/3
 */
public abstract class AbstractExecutor implements Executor {


    public interface HttpRequest<T>{
        /**
         * 封装http请求调用
         * @return
         */
        T request();
    }

    private static class GetRequest implements HttpRequest<Map<String, Object>>{
        @Override
        public Map<String, Object> request() {
            return null;
        }
    }

    private static class PostRequest implements HttpRequest<Map<String, Object>>{
        @Override
        public Map<String, Object> request() {
            return null;
        }
    }

    private static class PutRequest implements HttpRequest<Map<String, Object>>{
        @Override
        public Map<String, Object> request() {
            return null;
        }
    }

    private static class DeleteRequest implements HttpRequest<Map<String, Object>>{
        @Override
        public Map<String, Object> request() {
            return null;
        }
    }

    public static HttpRequest newPostRequest(){
        return new PostRequest();
    }

}
