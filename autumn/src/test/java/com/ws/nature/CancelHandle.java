package com.ws.nature;

import com.ws.nature.core.Context;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * CancelHandle
 *
 * @author wanshou
 * @date 2018/8/18
 */
@Service("CancelHandle")
public class CancelHandle implements Handle{

    @Override
    public void handle(Context context) {
        System.out.println("1.执行"+context.getHandleName()+"需要处理的业务");
        Map<String, Object> map = context.getResult();
        map.put("code", context.getResult());
        map.put("successMsg", "状态从当前节点：" + context.getPresent() + " 到变更到：" + context.getExpect());
    }

}
