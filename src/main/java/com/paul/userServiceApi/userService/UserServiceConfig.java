package com.paul.userServiceApi.userService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;

@Configuration
public class UserServiceConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserServiceRepository repository) {
        return args -> {
            UserService userService1 = new UserService(
                    "Abhishek Paul",
                    "personal",
                    "abhishek.paulcp.dbs@gmail.com",
                    LocalDate.of(2000, DECEMBER, 5),
                    21
            );

            UserService userService2 = new UserService(
                    "Abhishek Paul",
                    "personal",
                    "abhishekpaul512.2@gmail.com",
                    LocalDate.of(2000, DECEMBER, 5),
                    21
            );

            repository.saveAll(
                    List.of(userService1, userService2)
            );
        };
    }
}
