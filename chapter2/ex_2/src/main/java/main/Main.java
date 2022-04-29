package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        String hello = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);

        System.out.println(p.getName());
        System.out.println(hello);
        System.out.println(ten);
    }
}
