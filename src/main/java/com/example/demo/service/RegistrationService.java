package com.example.demo.service;

import com.example.demo.dto.RegistrationRequest;

public interface RegistrationService {

    String register(RegistrationRequest request);

    String confirmToken(String token);
}
