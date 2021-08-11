package com.example.demo.service;

import com.example.demo.entity.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationTokenService {

    void saveConfirmationToken(ConfirmationToken token);

    Optional<ConfirmationToken> getToken(String token);

    int setConfirmedAt(String token);
}
