package com.neilge.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NILGE on 9/15/17.
 */
public class SpringHelloApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
