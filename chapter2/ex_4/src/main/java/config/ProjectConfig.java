package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Toby");
        return p;
    }

    @Bean (name = "Peter")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Peter");
        return p;
    }
}
