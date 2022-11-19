package com.cytech.palaning.model;

public class User {
	
	
	
    protected String firstName;
    protected String email;
    protected int phone;
    protected String lastName;
    protected String password;
    protected String role;

    public User(String firstName, String email, int phone, String lastName, String password, String role) {
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }



}
