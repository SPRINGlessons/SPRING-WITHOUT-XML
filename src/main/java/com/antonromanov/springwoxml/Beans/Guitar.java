package com.antonromanov.springwoxml.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Anton on 09.04.2018.
 */



public class Guitar implements Instrument{


    @Override
    public void play() {
        System.out.println("Брямс");
    }
}
