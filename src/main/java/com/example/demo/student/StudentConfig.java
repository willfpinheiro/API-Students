package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student will = new Student(
                    1L,
                    "Will",
                    "will@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student carlos = new Student(
                    2L,
                    "Carlos",
                    "carlos@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(will, carlos)
            );
        };
    }
}
