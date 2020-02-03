package com.kveola13.annotation;

import org.springframework.stereotype.Component;

@Component
public class Alert implements AnnotationProcessor {
    public void process() {
        System.out.println("Alert! This is an annotation");
    }
}
