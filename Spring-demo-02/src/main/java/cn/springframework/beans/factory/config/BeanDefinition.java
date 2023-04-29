package cn.springframework.beans.factory.config;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 21:59
 * @Version 1.0
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
