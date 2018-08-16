package com.ws.nature.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * SpringHelper
 *
 * @author wanshou
 * @date 2018/2/27
 */
@Component
public class SpringHelper implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringHelper.applicationContext == null) {
            SpringHelper.applicationContext = applicationContext;
        }
    }

    /***
     * 根据一个bean的name获取配置文件中相应的bean
     */
    public static <T> T getBeanByName(String name, Class<T> requiredType) throws BeansException {
        if(StringUtils.isNotBlank(name) && requiredType != null){
            return applicationContext.getBean(name, requiredType);
        }else {
            return null;
        }
    }

    /***
     * 根据一个bean的类型获取配置文件中相应的bean
     */
    public static <T> T getBeanByClass(Class<T> requiredType) throws BeansException {
        return applicationContext.getBean(requiredType);
    }

    public static ApplicationContext getApplicationContext() {
        return SpringHelper.applicationContext;
    }
}
