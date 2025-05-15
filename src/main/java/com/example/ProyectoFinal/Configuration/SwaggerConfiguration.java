package com.example.ProyectoFinal.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Psicología")
                        .version("1.0")
                        .description("Documentación de la API para la app de ayuda psicológica")
                        .contact(new Contact()
                                .name("Soporte API")
                                .email("soporte@ayudapsico.com")
                        )
                );
    }
}
