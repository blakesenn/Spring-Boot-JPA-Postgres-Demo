package com.example.demo.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User Blake = new User(1L, "Blake", "blake@email.com", LocalDate.of(1999, Month.JANUARY, 5), 21);
            User Jax = new User("Jax", "jax@email.com", LocalDate.of(1990, Month.DECEMBER, 3), 22);

            repository.saveAll(
                    List.of(Blake, Jax));
        };
    }

}
