package com.project.voizfonica.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

@Data
@Document
public class NewConnection {
     @Id
    String id;
    public long rand=(long) (Math.random()*100000000+9872100000L);
    @NotBlank
    @Digits(integer=10,message="Invalid mobile number",fraction = 0)

    @NotBlank
    @Size(min = 7,message = "Invalid email")
    private String email;
    @NotBlank
    @Digits(integer=10,message="Invalid Aadhar Number",fraction = 0)
    private String aadhar;
    @NotBlank
    @Digits(integer=6,message="Invalid Pin",fraction = 0)
    private String zip;
    @NotBlank
    @Size(min = 6,message = "Invalid city")
    private String city;
    @NotBlank
    @Size(min = 6,message = "Invalid state")
    private String state;
    @NotBlank
    @Size(min =5,message = "Enter at least 5 characters")
    private  String username;
    @NotBlank
    @Size(min = 15,message = "Enter valid address")
    private String address1;
    @NotBlank
    @Size(min = 15,message = "Enter valid address")
    private String address2;
    @NotBlank
    private String connection;
}