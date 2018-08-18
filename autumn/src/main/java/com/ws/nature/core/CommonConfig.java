package com.ws.nature.core;

/**
 * CommonConfig
 * 该类为使用使用需要配置的文件，当框架开发完成，会定制统一的配置方式
 * @author wanshou
 * @date 2018/8/16
 */
public class CommonConfig {

//[
//    {
//        "handleName":"DefaultHandle",
//            "present":"AAA",
//            "expect":"BBB",
//            "code":0,
//            "success":"状态流转到成功",
//            "fail":"状态流转失败"
//    },
//    {
//        "handleName":"SkipHandle",
//            "present":"BBB",
//            "expect":"CCC",
//            "code":0,
//            "success":"状态流转到成功",
//            "fail":"状态流转失败"
//    },
//    {
//        "handleName":"CancelHandle",
//            "present":"CCC",
//            "expect":"DDD",
//            "code":0,
//            "success":"状态流转到成功",
//            "fail":"状态流转失败"
//    }
//]

    public final static String flows = "[{\"handleName\":\"DefaultHandle\",\"present\":\"AAA\",\"expect\":\"BBB\",\"code\":0,\"success\":\"状态流转到成功\",\"fail\":\"状态流转失败\"},{\"handleName\":\"SkipHandle\",\"present\":\"BBB\",\"expect\":\"CCC\",\"code\":0,\"success\":\"状态流转到成功\",\"fail\":\"状态流转失败\"},{\"handleName\":\"CancelHandle\",\"present\":\"CCC\",\"expect\":\"DDD\",\"code\":0,\"success\":\"状态流转到成功\",\"fail\":\"状态流转失败\"}]";

    public final static String listeners = "[\"DefaultListener\"]";

}
