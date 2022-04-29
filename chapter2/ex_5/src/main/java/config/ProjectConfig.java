package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Toby");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Esther");
        return p;
    }
}
