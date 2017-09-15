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

        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        context.close();
    }
}
