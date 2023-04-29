import org.example.springframework.BeanDefinition;
import org.example.springframework.BeanFactory;
import org.junit.jupiter.api.Test;
import springframework.UserService;

/**
 * @Author hanzezheng
 * @Description TODO
 * @Date 2023/4/29 21:23
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void UserTest() {

        BeanFactory beanFactory = new BeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
