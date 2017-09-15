package com.neilge.demo;

/**
 * Created by NILGE on 9/15/17.
 */
public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
