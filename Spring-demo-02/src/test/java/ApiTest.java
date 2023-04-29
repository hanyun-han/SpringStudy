import bean.UserService;
import cn.springframework.beans.factory.config.BeanDefinition;
import cn.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 22:27
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test() throws Exception {
        //初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //第一次获取bean
        UserService service = (UserService) beanFactory.getBean("userService");
        service.queryInfo();
        //第二次获取 bean from Singleton
        UserService userService_Singleton = (UserService) beanFactory.getBean("userService");
        userService_Singleton.queryInfo();
    }

}
