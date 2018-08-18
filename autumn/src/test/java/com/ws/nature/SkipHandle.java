package com.ws.nature;

import com.ws.nature.core.Context;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * SkipHandle
 *
 * @author wanshou
 * @date 2018/8/18
 */
@Service("SkipHandle")
public class SkipHandle implements Handle{

    @Override
    public void handle(Context context) {
        System.out.println("执行"+context.getHandleName()+"需要处理的业务");
    }

}
