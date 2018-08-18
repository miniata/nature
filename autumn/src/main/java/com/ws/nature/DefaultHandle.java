package com.ws.nature;

import com.ws.nature.core.Context;
import org.springframework.stereotype.Service;

/**
 * BaseHandle
 *
 * @author wanshou
 * @date 2018/8/15
 */
@Service("DefaultHandle")
public class DefaultHandle implements Handle{

    @Override
    public void handle(Context context) {
        System.out.println("1.执行"+context.getHandleName()+"需要处理的业务");
    }
}
