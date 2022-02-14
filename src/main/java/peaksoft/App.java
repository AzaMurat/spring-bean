package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean1 = applicationContext.getBean("Cat",Cat.class) ;
        Cat bean3 = applicationContext.getBean("Cat",Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean1==bean3);

    }
}
