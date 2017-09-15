package com.neilge.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author neilge
 * @since 2017-09-15
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "AAA",
            "BBB",
            "CCC"
    };

    private Random random = new Random();

    @Override
    public String getDailyFortune() {
        return data[random.nextInt(data.length)];
    }
}
