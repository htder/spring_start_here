package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot2);
        return person;
    }

    @Bean
    public Person person1(
            @Qualifier("parrot1") Parrot parrot
    ) {
        Person p = new Person();
        p.setName("Gary");
        p.setParrot(parrot);
        return p;
    }
}
