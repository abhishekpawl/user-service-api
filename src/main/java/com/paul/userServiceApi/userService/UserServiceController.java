package com.paul.userServiceApi.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "{userId}")
    public Optional<UserService> getUserById(@PathVariable("userId") Long userId) {
        return userServiceService.getUserById(userId);
    }

    @PostMapping
    public void registerUser(@RequestBody UserService userService) {
        userServiceService.addUser(userService);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userServiceService.deleteUser(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String profile,
            @RequestParam(required = false) String email
    ) {
        userServiceService.updateUser(userId, name, profile, email);
    }
}
