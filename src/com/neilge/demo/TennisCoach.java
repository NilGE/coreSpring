package com.neilge.demo;

import org.springframework.stereotype.Component;

/**
 * @author neilge
 * @since 2017-09-15
 */
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
