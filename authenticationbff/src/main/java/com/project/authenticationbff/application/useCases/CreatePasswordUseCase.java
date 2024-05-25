package com.project.authenticationbff.application.useCases;

import com.project.authenticationbff.application.interfaces.ICreatePasswordUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.HashSet;

@Service
@RequestScope
public class CreatePasswordUseCase implements ICreatePasswordUseCase {

    private final Logger logger = LoggerFactory.getLogger(CreatePasswordUseCase.class);

    @Override
    public Boolean execute(String password) {
        Boolean validated = validate(password);

        if(validated == true){
            logger.info("Senha Informada Validada Com Sucesso");

        } else {
            logger.warn("Senha Informada Não Validada");

        }

        return validated;
    }

    private boolean validate(String password) {
        // Verifica se a senha foi preenchida
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        // Verifica se a senha tem pelo menos 9 caracteres
        if (password.length() < 9) {
            return false;
        }

        // Verifica se a senha contém pelo menos um dígito
        boolean hasDigit = false;
        // Verifica se a senha contém pelo menos uma letra minúscula
        boolean hasLowerCase = false;
        // Verifica se a senha contém pelo menos uma letra maiúscula
        boolean hasUpperCase = false;
        // Verifica se a senha contém pelo menos um caractere especial
        boolean hasSpecialChar = false;

        // Conjunto para verificar caracteres repetidos
        HashSet<Character> charSet = new HashSet<>();

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if ("!@#$%^&*()-+".indexOf(c) != -1) {
                hasSpecialChar = true;
            }

            // Verifica se há repetição e retorna
            if (charSet.contains(c)) {
                return false; // Caractere repetido encontrado, senha inválida
            }
            charSet.add(c);
        }

        // Verifica se todos os critérios foram atendidos
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }
}
