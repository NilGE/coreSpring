package com.neilge.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author neilge
 * @since 2017-09-15
 */
@Configuration
//@ComponentScan("com.neilge.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {

        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {

        return new SwimCoach(sadFortuneService());
    }
}