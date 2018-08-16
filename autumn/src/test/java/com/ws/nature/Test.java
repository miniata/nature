package com.ws.nature;

import com.ws.nature.core.Context;
import com.ws.nature.core.FlowEngine;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test
 *
 * @author wanshou
 * @date 2018/8/16
 */
public class Test extends BaseJunit4Test{

    @org.junit.Test
    public void client(){
        FlowEngine<State> flowEngine = CommonFactory.newFlowEngine(State.class);
        Context context = flowEngine.getContext(State.AAA, State.BBB);
        context.toHandle();
//        Context context1 = flowEngine.getContext(State.BBB, State.AAA);
//        context1.getHandle().handle();
    }

}
