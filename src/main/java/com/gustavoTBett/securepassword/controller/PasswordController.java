package com.gustavoTBett.securepassword.controller;

import com.gustavoTBett.securepassword.dto.PasswordDto;
import com.gustavoTBett.securepassword.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustavo
 */
@RestController
@RequestMapping
public class PasswordController {
    
    @Autowired
    private PasswordService PasswordService;
    
    @PostMapping
    public ResponseEntity create(@RequestBody PasswordDto passwordDto) {
        if (passwordDto.getPassword() == null || passwordDto.getPassword().isBlank()) {
            return ResponseEntity.status(400).body("A senha está vazia ou em branco");
        } else {
            int valorRetorno = PasswordService.isStrong(passwordDto.getPassword());
            if (valorRetorno == 5) {
                return ResponseEntity.status(204).build();
            } else {
                String body = "";
                if (valorRetorno == 4) {
                    body = "A senha está faltando uma caractere especial";
                } else if (valorRetorno == 3) {
                    body = "A senha está faltando uma letra maiúscula";
                } else if (valorRetorno == 2) {
                    body = "A senha está faltando uma letra minúscula";
                } else if (valorRetorno == 1) {
                    body = "A senha está faltando um dígito númerico";
                } else if (valorRetorno == 0) {
                    body = "A senha tem menos que 8 carecteres";
                }
                return ResponseEntity.status(400).body(body);
            }
        }
    }
}
