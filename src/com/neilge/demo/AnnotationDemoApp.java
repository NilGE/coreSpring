package com.neilge.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author neilge
 * @since 2017-09-15
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach coach1 = context.getBean("tennisCoach", Coach.class);

        boolean isSame = (coach == coach1);

        System.out.println("\nPointing to the same object: " + isSame);

        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for coach1: " + coach1);

        context.close();
    }
}
