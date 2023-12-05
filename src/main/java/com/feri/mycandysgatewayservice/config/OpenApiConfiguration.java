package com.feri.mycandysgatewayservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;

@OpenAPIDefinition(
        info = @Info(
                description = "Gateway API for MyCandys application",
                title = "MyCandys Gateway API",
                version = "1.0",
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        url = "http://localhost:8081"
                ),
        }
)
public class OpenApiConfiguration { }
