package com.journaldev.bootifulmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class BootMongoDBApp {

	public static void main(String[] args) {
		SpringApplication.run(BootMongoDBApp.class, args);
	}
}