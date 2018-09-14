package com.ws.nature.core;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志消息扩展类
 *
 * @author wanshou
 * @date 2018/9/13
 */
public abstract class Message implements Serializable, Cloneable{

    /**
     * 系统名
     */
    private String systemName;

    /**
     * 创建时间
     */
    private Date createTime;

}
