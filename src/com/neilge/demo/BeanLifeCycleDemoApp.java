package com.neilge.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author neilge
 * @since 2017-09-15
 */
public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach coach = context.getBean("trackCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
