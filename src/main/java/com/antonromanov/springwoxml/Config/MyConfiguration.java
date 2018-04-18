package com.antonromanov.springwoxml.Config;

import com.antonromanov.springwoxml.Beans.Instrument;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Anton on 09.04.2018.
 */

@Configuration
public class MyConfiguration {

    @Bean
    public Instrument GetInstrument() {
        return new Instrument() {
            @Override
            public void play() {
                System.out.println("bring-bring");
            }
        };
    }



}
