package com.kidz.krch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
public class KrchApplication {
    //TODO : move logic to service



	public static void main(String[] args) {
		SpringApplication.run(KrchApplication.class, args);
	}




}
