package com.xworkz.spring.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Component;


// here i am creating my own annotation for replaceing component i am using my annotation @Raghavendra
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface Raghavendra {

}
