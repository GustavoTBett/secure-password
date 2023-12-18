package com.gustavoTBett.securepassword.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author gustavo
 */
@Service
public class PasswordService {
    
    public int isStrong(String password) {
        if (password.length() <= 8) {
            return 0;
        } else if (!password.matches(".*\\d.*")) {
            return 1;
        } else if (!password.matches(".*[a-z].*")) {
            return 2;
        } else if (!password.matches(".*[A-Z].*")) {
            return 3;
        } else if (!password.matches(".*[!@#$%^&*()_+{}|:;<>,.?/~`].*")) {
            return 4;
        } else {
            return 5;
        }
    }
}
