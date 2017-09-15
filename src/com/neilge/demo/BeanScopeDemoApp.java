package com.neilge.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author neilge
 * @since 2017-09-15
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("trackCoach", Coach.class);

        Coach coach2 = context.getBean("trackCoach", Coach.class);

        boolean result = (coach == coach2);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for coach2: " + coach2);

        context.close();
    }
}
