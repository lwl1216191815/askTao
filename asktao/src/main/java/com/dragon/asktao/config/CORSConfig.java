package com.dragon.asktao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决跨域问题
 * @author 龙帅
 */
@Configuration
public class CORSConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                CorsRegistration corsRegistration = registry.addMapping("/**");
                corsRegistration.allowedHeaders("*");
                corsRegistration.allowedMethods("*");
                corsRegistration.allowedOrigins("*");
            }
        };
    }
}
