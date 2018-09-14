package com.ws.nature;

/**
 * IRunner
 *
 * @author wanshou
 * @date 2018/9/13
 */
public interface IServiceRunner {

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

    /**
     * 判断服务是否正在运行
     * @return 返回当前服务的运行状态
     * @throws Throwable
     */
    boolean isRunning() throws Throwable;

}
