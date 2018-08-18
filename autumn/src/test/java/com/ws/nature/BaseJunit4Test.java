package com.ws.nature;

import com.ws.nature.plugin.HandleListener;
import com.ws.nature.util.SpringHelper;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * BaseJunit4Test
 *
 * @author wanshou
 * @date 2018/8/16
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(classes = {DefaultHandle.class, CancelHandle.class,
        SkipHandle.class, DefaultListener.class, SpringHelper.class}) //加载配置文件
public class BaseJunit4Test {
}
