package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot's name: " + person.getParrot());
    }
}
