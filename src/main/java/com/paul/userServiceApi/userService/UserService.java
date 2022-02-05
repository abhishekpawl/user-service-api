package com.paul.userServiceApi.userService;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class UserService {

    @Id
    @SequenceGenerator(
            name = "userservice_sequence",
            sequenceName = "userservice_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userservice_sequence"
    )
    private Long id;
    private String name;
    private String profile;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    public UserService() {
    }

    public UserService(Long id, String name, String profile, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.dob = dob;
    }

    public UserService(String name, String profile, String email, LocalDate dob) {
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.dob = dob;
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
        return Period.between(this.dob, LocalDate.now()).getYears();
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
