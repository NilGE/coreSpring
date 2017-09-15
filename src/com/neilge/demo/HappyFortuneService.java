package com.neilge.demo;

/**
 * @author neilge
 * @since 2017-09-15
 */
public class HappyFortuneService implements FortuneService {


    @Override
    public String getFortune() {

        return "Today is your lucky day";
    }
}
