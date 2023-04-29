package cn.springframework.beans.factory.support;

import cn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:23
 * @Version 1.0
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
