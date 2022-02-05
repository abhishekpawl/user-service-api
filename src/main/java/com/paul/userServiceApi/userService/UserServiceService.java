package com.paul.userServiceApi.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceService {

    private final UserServiceRepository userServiceRepository;

    @Autowired
    public UserServiceService(UserServiceRepository userServiceRepository) {
        this.userServiceRepository = userServiceRepository;
    }

    public List<UserService> getUsers() {
        return userServiceRepository.findAll();
    }

    public void addUser(UserService userService) {
        Optional<UserService> userByEmail = userServiceRepository.findUserByEmail(userService.getEmail());

        if(userByEmail.isPresent()) {
            throw new IllegalStateException("Email already taken!");
        }

        userServiceRepository.save(userService);
    }
}
