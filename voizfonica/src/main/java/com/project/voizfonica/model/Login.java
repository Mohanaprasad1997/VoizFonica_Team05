package com.project.voizfonica.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@Document
public class Login {
    @NotEmpty
    private String contact;

    @NotEmpty(message = "Provide password")
    private String password;
    private String username;
    private String email;

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
