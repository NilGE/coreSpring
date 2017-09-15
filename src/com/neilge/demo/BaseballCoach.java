package com.neilge.demo;

/**
 * Created by NILGE on 9/15/17.
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
