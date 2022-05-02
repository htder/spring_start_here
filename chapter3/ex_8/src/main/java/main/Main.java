package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean("person", Person.class);
        System.out.println("Person's name: " + person1.getName());
        System.out.println("Person's Parrot: " + person1.getParrot());

        Person person2 = context.getBean("person1", Person.class);
        System.out.println("Person's name: " + person2.getName());
        System.out.println("Person's Parrot: " + person2.getParrot());
    }
}
