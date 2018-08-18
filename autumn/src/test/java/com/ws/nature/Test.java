package com.ws.nature;

import com.ws.nature.core.CommonFactory;
import com.ws.nature.core.Context;
import com.ws.nature.core.FlowEngine;

import java.util.Map;

/**
 * Test
 *
 * @author wanshou
 * @date 2018/8/16
 */
public class Test extends BaseJunit4Test{

    @org.junit.Test
    public void client(){
        //1.正常使用测试
        FlowEngine<State> flowEngine = CommonFactory.newFlowEngine(State.class);
        Context context = flowEngine.getContext(State.AAA, State.BBB);
        context.toHandle();
        context = flowEngine.getContext(State.BBB, State.CCC);
        context.toHandle();
        context = flowEngine.getContext(State.CCC, State.DDD);
        context.toHandle();
        //2.测试不存在的流程
        //Context context1 = flowEngine.getContext(State.BBB, State.AAA);
        //context1.toHandle();
        //3.测试参数传入null
        //Context context1 = flowEngine.getContext(null, null);
        //context1.toHandle();
        //4.测试只能传入枚举类型
        //FlowEngine<CommonConfig> flowEngine = CommonFactory.newFlowEngine(CommonConfig.class);
        //5.测试混入其他枚举类型
        //FlowEngine<State> flowEngine1 = CommonFactory.newFlowEngine(State.class);
        //flowEngine1.getContext(OrderState.AAA, OrderState.BBB);
        //6.测试跳过工厂方法创建流程引擎,看是否可以成功
        //FlowEngine flowEngine1 = new FlowEngine<>();
    }

}
