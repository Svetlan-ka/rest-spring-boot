package ru.netology.REST.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class User {
    @NotBlank(message = "Login can't be empty")
    @Size(min = 3, max = 20, message = "Login must be between 3 and 20 characters")
    private String login;

    @NotBlank(message = "Password can't be empty")
    @Size(min = 3, max = 10, message = "Password must be between 3 and 10 characters")
    private String password;
}

