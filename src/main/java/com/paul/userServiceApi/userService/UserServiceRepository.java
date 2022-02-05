package com.paul.userServiceApi.userService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserServiceRepository extends JpaRepository<UserService, Long> {

    @Query("SELECT u FROM UserService u WHERE u.email = ?1")
    Optional<UserService> findUserByEmail(String email);
}
