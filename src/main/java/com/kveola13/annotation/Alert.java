package com.kveola13.annotation;

public class Alert implements AnnotationProcessor {
    public void process() {
        System.out.println("Alert! This is an annotation");
    }
}
