package com.tw.common.spring;

/**
 * Created by tengw on 2017/7/20.
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.Assert;

import javax.servlet.ServletContext;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;


public class ApplicationContextUtil implements ApplicationContextAware
{

    private static ApplicationContext ctx = null;

    private static String contextPath;
    public void setApplicationContext(ApplicationContext ctx) throws BeansException
    {
        ApplicationContextUtil.ctx = ctx;
        ApplicationContextUtil.contextPath = ctx.getBean(ServletContext.class).getContextPath();
    }
    public static ApplicationContext getApplicationContext() {
        return ctx;
    }
    public static String getContextPath() {
        return contextPath;
    }

    /**
     * @Description: 根据Bean的ID获取返回的Bean <br/>
     * @return T 返回类型 <br/>
     */
    public static Object getBean(String name) throws BeansException
    {
        return ctx.getBean(name);
    }

    public static void autowireBean(Object existingBean) {
        getApplicationContext().getAutowireCapableBeanFactory().autowireBean(existingBean);
    }



    public static <T> T getBean(Class<T> type) {
        Assert.notNull(type);
        return ctx.getBean(type);
    }

    public static <T> T getBean(String name, Class<T> type) {
        Assert.hasText(name);
        Assert.notNull(type);
        return ctx.getBean(name, type);
    }

    public static <T extends Annotation, F> List<F> findAnnotatedBeans(Class<T> annotationType, Class<F> elementType) {
        List<F> beans = new ArrayList<>();
        for (String name : BeanFactoryUtils.beanNamesForTypeIncludingAncestors(ctx, Object.class)) {
            if (ctx.findAnnotationOnBean(name, annotationType) != null) {
                beans.add(ctx.getBean(name, elementType));
            }
        }

        return beans;
    }

    public static <T> List<T> findBeansByType(Class<T> beanType) {
        List<T> beans = new ArrayList<>();
        beans.addAll(ctx.getBeansOfType(beanType).values());

        return beans;
    }

}
