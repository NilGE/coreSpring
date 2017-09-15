package com.neilge.demo;

import org.springframework.stereotype.Component;

/**
 * @author neilge
 * @since 2017-09-15
 */
@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Database Fortune Service";
    }
}
