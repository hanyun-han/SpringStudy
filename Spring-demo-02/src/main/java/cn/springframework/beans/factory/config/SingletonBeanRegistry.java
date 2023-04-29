package cn.springframework.beans.factory.config;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:00
 * @Version 1.0
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
