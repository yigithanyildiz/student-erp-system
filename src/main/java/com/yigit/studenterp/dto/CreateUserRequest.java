package com.yigit.studenterp.dto;

import com.yigit.studenterp.entity.Role;

public class CreateUserRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;

    public CreateUserRequest() {}

    // Getters
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Role getRole() { return role; }

    // Setters
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setRole(Role role) { this.role = role; }
}