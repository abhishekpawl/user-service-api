package com.paul.userServiceApi.userService;

import java.time.LocalDate;

public class UserService {
    private Long id;
    private String name;
    private String profile;
    private String email;
    private LocalDate dob;
    private Integer age;

    public UserService() {
    }

    public UserService(Long id, String name, String profile, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public UserService(String name, String profile, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
