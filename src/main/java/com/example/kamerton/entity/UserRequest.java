package com.example.kamerton.entity;

import jakarta.persistence.*;



@Entity
// Annotation table Dbeaver "user_requests"
@Table(name = "user_requests")

public class  UserRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId; // id - request
    private String userName; // user who create request
    private String phoneNumber; // phone number of creator request
    private String email; // email of creator request
    private String request_message; // request message

    //  Get methods request table
    public Long getRequestId() {
        return this.requestId;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getEmail() {
        return this.email;
    }
    public String getRequestMessage() {
        return this.request_message;
    }
    // Set methods request table
    public void setUserName(String userName) {
        this.userName = userName;
    }
     public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     public void setEmail(String email) {
        this.email = email;
    }
     public void setRequestMessage(String requestMessage) {
        this.request_message = requestMessage;
    }
}
