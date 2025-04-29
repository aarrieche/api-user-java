package com.example.demo.model;

import java.util.List;

public record NewUser(
        String name,
        String handle,
        String email,
        String password,
        String company,
        Profile.AccountType type,
        List<String> roles
)  {

}
