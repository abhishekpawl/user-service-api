package com.paul.userServiceApi.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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

    public void deleteUser(Long userId) {
        boolean userExists = userServiceRepository.existsById(userId);

        if(!userExists) {
            throw new IllegalStateException("User with id: " + userId + " does not exist!");
        }

        Optional<UserService> byId = userServiceRepository.findById(userId);

        System.out.println(byId);

        userServiceRepository.deleteById(userId);
    }

    @Transactional
    public void updateUser(Long userId, String name, String profile, String email) {
        UserService userService = userServiceRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException("User with id: " + userId + " does not exist!"));

        // update name
        if (
                name != null &&
                        name.length() > 0 &&
                        !Objects.equals(userService.getName(), name)
        ) {
            userService.setName(name);
        }

        // update profile
        if (
                profile != null &&
                        profile.length() > 0 &&
                        !Objects.equals(userService.getProfile(), profile)
        ) {
            userService.setProfile(profile);
        }

        // update email
        if (
                email != null &&
                        email.length() > 0 &&
                        !Objects.equals(userService.getEmail(), email)
        ) {
            Optional<UserService> userByEmail = userServiceRepository.findUserByEmail(email);

            if(userByEmail.isPresent()) {
                throw new IllegalStateException("Email already taken!");
            }

            userService.setEmail(email);
        }
    }
}
