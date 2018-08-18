package com.ws.nature.plugin;

import com.ws.nature.core.Context;

/**
 * HandleListener
 *
 * @author wanshou
 * @date 2018/8/16
 */
public interface HandleListener {

    /**
     * 监听流程状态变更
     * @param context
     */
    void update(Context context);

}
