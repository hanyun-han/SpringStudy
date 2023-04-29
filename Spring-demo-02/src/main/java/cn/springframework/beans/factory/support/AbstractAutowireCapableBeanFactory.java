package cn.springframework.beans.factory.support;

import cn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:16
 * @Version 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws Exception {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new Exception("Instantiation of bean failed", e);
        }
        return bean;
    }
}
