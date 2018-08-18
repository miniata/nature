package com.ws.nature;

import com.ws.nature.core.Context;
import com.ws.nature.plugin.HandleListener;
import org.springframework.stereotype.Service;

/**
 * DefaultListener
 *
 * @author wanshou
 * @date 2018/8/18
 */
@Service("DefaultListener")
public class DefaultListener implements HandleListener{

    @Override
    public void update(Context context) {
        System.out.println("状态变更由："+context.getHandleName()+" 来完成");
        System.out.println("状态从当前节点：" + context.getPresent() + " 到变更到：" + context.getExpect());
        System.out.println("------------------------------");
    }

}
