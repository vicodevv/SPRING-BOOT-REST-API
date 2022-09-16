package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student victor = new Student(
						"Victor Omoniyi",
						21,
						LocalDate.of(2001, Month.JULY, 13), 
						"vomoniyi2001@gmail.com"
				);
            Student hamis = new Student(
                        "AlHamis Badru",
                        20,
                        LocalDate.of(2002, Month.JUNE, 30),
                        "alhamisbadru@gmail.com"
            );
            repository.saveAll(
                    List.of(victor, hamis)
            );
        };
    }
}
