package com.paul.userServiceApi.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
