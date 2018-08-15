package com.ws.nature;

import com.ws.nature.core.StandardStateFlow;

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
    Map<String, Object> handle(StandardStateFlow context);

}
