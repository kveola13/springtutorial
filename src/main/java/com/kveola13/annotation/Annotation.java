package com.kveola13.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
    @Autowired
    AnnotationProcessor processor;

    public AnnotationProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(AnnotationProcessor processor) {
        this.processor = processor;
    }

    public void config() {
        System.out.println("How to annotate in Spring");
        processor.process();
    }
}
