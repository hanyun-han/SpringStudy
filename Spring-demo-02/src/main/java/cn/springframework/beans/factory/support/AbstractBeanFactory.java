package cn.springframework.beans.factory.support;

import cn.springframework.beans.factory.BeanFactory;
import cn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:04
 * @Version 1.0
 */
public abstract class AbstractBeanFactory extends DefaulSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws Exception {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws Exception;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws Exception;
}
