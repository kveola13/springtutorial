package com.kveola13.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kveola13")
public class AppConfig {
/*    @Bean
    public Annotation getAnnotation(){
        return new Annotation();
    }

    @Bean
    public AnnotationProcessor getProcessor(){
        return new Alert();
    }*/
}
