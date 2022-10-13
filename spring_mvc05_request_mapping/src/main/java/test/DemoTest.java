package test;

import com.star.config.SpringConfig;
import com.star.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class DemoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = ctx.getBean(UserController.class);
        System.out.println(bean);
    }
}
