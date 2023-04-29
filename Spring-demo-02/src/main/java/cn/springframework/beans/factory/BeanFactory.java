package cn.springframework.beans.factory;

import cn.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:06
 * @Version 1.0
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
