package com.sf.mdmmock.mdm.model;

import javax.validation.constraints.*;

public class User {

    @Size(min = 2, max = 50, message = "First Name should have at least 2 characters")
    private String firstName;

    @Size(min = 2, max = 50, message = "Last Name should have at least 2 characters")
    private String lastName;

    @Email
    @NotEmpty(message = "Email can not be empty")
    @Size(min = 3, max = 500, message = "Email should be between 3 and 500 characters")
    private String email;

    @NotEmpty(message = "Password can not be empty")
    @Size(min = 6, max = 50, message = "Password should be at least six characters")
    private String password;

    public User() {
        super();
    }

    public User(@Email @NotBlank(message = "Email can not be empty") @NotEmpty(message = "Email can not be empty") String email,
                @Size(min = 6, max = 50, message = "Password should be at least six characters") @NotEmpty(message = "Password can not be empty") String password) {
        this.email = email;
        this.password = password;
    }

    public User(@NotNull @Size(min = 2, message = "First Name should have at least 2 characters") String firstName, @NotNull @Size(min = 2, message = "Last Name should have at least 2 characters") String lastName, @Email @NotBlank(message = "Email can not be empty") @NotEmpty(message = "Email can not be empty") String email,
                @NotBlank(message = "Password can not be empty") @NotEmpty(message = "Email can not be empty") String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
