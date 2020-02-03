package com.kveola13.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Warning implements AnnotationProcessor {
    public void process() {
        System.out.println("Warning! This is an annotation");
    }
}
