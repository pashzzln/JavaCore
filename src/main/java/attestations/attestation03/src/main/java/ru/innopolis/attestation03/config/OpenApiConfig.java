package ru.innopolis.attestation03.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class OpenApiConfig {
    @Bean
    public OpenAPI openApiProjectConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("test")
                        .description("Сервис по аренде онлайн книг")
                        .version("1.0.0")
                        .license(new License().name("Apache Free License 2.0"))
                        .contact(new Contact().name("Zelenov P Dm")
                                .email("supemail@mail.ru"))
                );
    }
}

