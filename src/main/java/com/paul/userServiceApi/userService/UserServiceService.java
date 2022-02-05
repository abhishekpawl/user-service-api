package com.paul.userServiceApi.userService;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserServiceService {

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
