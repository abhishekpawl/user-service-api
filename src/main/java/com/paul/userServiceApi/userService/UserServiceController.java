package com.paul.userServiceApi.userService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserServiceController {

    @GetMapping
    public List<UserService> getUsers() {
        return List.of(
                new UserService(
                        1L,
                        "Abhishek Paul",
                        "personal",
                        "abhishek.paulcp.dbs@gmail.com",
                        LocalDate.of(2000, Month.DECEMBER, 5),
                        21
                )
        );
    }
}
