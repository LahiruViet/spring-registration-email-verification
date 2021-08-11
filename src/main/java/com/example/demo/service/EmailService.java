package com.example.demo.service;

public interface EmailService {

    void send(String to, String email);

    String buildEmail(String name, String link);
}
