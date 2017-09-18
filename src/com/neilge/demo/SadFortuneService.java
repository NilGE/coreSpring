package com.neilge.demo;

/**
 * Created by NILGE on 9/18/17.
 */
public class SadFortuneService implements  FortuneService {

    @Override
    public String getDailyFortune() {

        return "Today is a sad day";
    }
}
