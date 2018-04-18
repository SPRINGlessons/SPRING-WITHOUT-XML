package com.antonromanov.springwoxml;

import com.antonromanov.springwoxml.Beans.Guitar;
import com.antonromanov.springwoxml.Beans.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithoutXmlTestApplication implements CommandLineRunner {




	private Instrument instrument;

	private Guitar guitar = new Guitar();



	@Autowired
	private void setInstr(Instrument instrument){
		this.instrument = instrument;
	}


	@Override
	public void run(String... args) throws Exception {

		setInstr(guitar);
		instrument.play();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringWithoutXmlTestApplication.class, args);
	}
}
