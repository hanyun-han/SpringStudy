package org.example.springframework;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 21:06
 * @Version 1.0
 */
public class BeanDefinition {

    private Object bean;

    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
