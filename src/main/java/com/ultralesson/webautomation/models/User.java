package com.ultralesson.webautomation.models;


import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Data;

@Data @Builder(toBuilder = true)
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User init() {
        Faker faker  = new Faker();
        return  User.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .password("123Password")
                .build();
    }

    public User userDataWithFirstNameEmpty() {
        User user =  init();
        user.setFirstName("dsjd");
        return user;
    }


}
