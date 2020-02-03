package com.kveola13.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Annotation {
    @Autowired
    @Qualifier("warning")
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
