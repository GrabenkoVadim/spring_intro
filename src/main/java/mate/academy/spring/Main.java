package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Fedor");
        user.setAge(22);
        User anotherUser = new User();
        anotherUser.setName("Another");
        anotherUser.setAge(25);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.add(anotherUser);
        userService.getAll().forEach(System.out::println);
        context.close();
    }
}
