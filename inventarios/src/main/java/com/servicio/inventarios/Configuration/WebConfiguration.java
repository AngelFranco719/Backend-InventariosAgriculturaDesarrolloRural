package com.servicio.inventarios.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")       // Permite cualquier origen
                        .allowedMethods("*")       // Permite cualquier método HTTP
                        .allowedHeaders("*");      // Permite cualquier encabezado
                // NO usar .allowCredentials(true) aquí
            }
        };
    }
}
