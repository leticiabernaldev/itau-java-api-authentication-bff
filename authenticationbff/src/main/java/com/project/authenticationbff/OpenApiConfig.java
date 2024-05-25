package com.project.authenticationbff;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Authentication API BFF - V1", version = "1.0", description = "Project created for Itaú selection process.", contact = @Contact(name = "Leticia Bernal", email = "leticiabernaldev@email.com")))
public class OpenApiConfig {

    @Bean
    GroupedOpenApi publicApi() {

        return GroupedOpenApi.builder()
                .group("Authentication API BFF - V1")
                .packagesToScan("com.project.authenticationbff")
                .build();
    }
}
