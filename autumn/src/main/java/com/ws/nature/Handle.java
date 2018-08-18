package com.ws.nature;

import com.ws.nature.core.Context;

import java.util.Map;

/**
 * Handle
 *
 * @author wanshou
 * @date 2018/8/15
 */
public interface Handle {

    /**
     * 两个状态流转之间策略接口
     * @param context
     * @return
     */
    void handle(Context context);

}
