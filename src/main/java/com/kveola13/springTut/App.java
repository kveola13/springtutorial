package com.kveola13.springTut;

import com.kveola13.annotation.Annotation;
import com.kveola13.annotation.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Annotation annotation = factory.getBean(Annotation.class);
        annotation.config();
    }
}
