package com.neilge.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author neilge
 * @since 2017-09-15
 */
@Component
public class HappyFortuneService implements FortuneService {

    @Override
    @Scope("singleton")
    public String getDailyFortune() {
        return "It is a lucky day";
    }
}
