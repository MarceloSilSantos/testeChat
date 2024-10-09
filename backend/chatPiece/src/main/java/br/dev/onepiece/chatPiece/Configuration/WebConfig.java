package br.dev.onepiece.chatPiece.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/messages")
                .allowedOrigins("http://localhost:5173") // URL do seu frontend
                .allowedMethods("GET", "POST")
                .allowCredentials(true);
    }
}