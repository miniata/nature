package com.ws.nature;

/**
 * 代表整个日志处理系统
 *
 * @author wanshou
 * @date 2018/9/14
 */
public interface IServer {

    /**
     * 启动服务
     * @return  启动成功或失败
     * @throws Throwable
     */
    boolean start() throws Throwable;

    /**
     * 停止服务
     * @return  停止成功或失败
     * @throws Throwable
     */
    boolean stop() throws Throwable;

}
