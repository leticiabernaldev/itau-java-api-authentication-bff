package com.project.authenticationbff;

import com.project.authenticationbff.application.useCases.CreatePasswordUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CreatePasswordUseCaseTest {


    @DisplayName("Should execute successfully if password is valid")
    @ParameterizedTest
    @CsvSource({
            "AbTp9!fok"
    })
    public void shouldExecuteSuccessfullyIfPasswordIsValid(String password) {

        // Arranje
        CreatePasswordUseCase useCase = new CreatePasswordUseCase();

        // Act
        var response = useCase.execute(password);

        // Assert
        assertNotNull(response);
        assertTrue(response);
    }

    @DisplayName("Should not execute if password is invalid")
    @ParameterizedTest
    @CsvSource({
            "Password25!",
            "ab",
            "AAAbbbCc",
            "AbTp9!foo",
            "AbTp9!foA",
            "AbTp9 fok",

    })
    public void shouldNotExecuteIfPasswordIsInvalid(String password) {

        // Arranje
        CreatePasswordUseCase useCase = new CreatePasswordUseCase();

        // Act
        var response = useCase.execute(password);

        // Assert
        assertNotNull(response);
        assertFalse(response);
    }
}
