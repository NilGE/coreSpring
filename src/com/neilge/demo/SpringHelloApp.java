package com.neilge.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NILGE on 9/15/17.
 */
public class SpringHelloApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);

        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}
