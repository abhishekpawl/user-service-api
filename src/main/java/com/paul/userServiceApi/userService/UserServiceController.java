package com.paul.userServiceApi.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserServiceController {

    private final UserServiceService userServiceService;

    @Autowired
    public UserServiceController(UserServiceService userServiceService) {
        this.userServiceService = userServiceService;
    }

    @GetMapping
    public List<UserService> getUsers() {
        return userServiceService.getUsers();
    }
}
