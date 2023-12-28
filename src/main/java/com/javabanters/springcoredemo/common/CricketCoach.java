package com.javabanters.springcoredemo.common;

import org.springframework.stereotype.Component;

//marks the class as a spring bean
@Component
public class CricketCoach implements Coach {


    @Override
    public String getWorkout() {
        return "Practice fast bowling for 20 mins";
    }
}
