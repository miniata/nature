package com.ws.nature;

import com.ws.nature.core.Context;
import com.ws.nature.core.DefaultStateFlow;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

/**
 * BaseHandle
 *
 * @author wanshou
 * @date 2018/8/15
 */
@Service("DefaultHandle")
public class DefaultHandle implements Handle{

    @Override
    public Map<String, Object> handle(Context context) {
        System.out.println("执行默认操作！！！");
        return Collections.emptyMap();
    }
}
