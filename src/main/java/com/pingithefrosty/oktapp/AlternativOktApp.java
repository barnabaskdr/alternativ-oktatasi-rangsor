package com.pingithefrosty.oktapp;

import com.pingithefrosty.oktapp.services.DataImportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


@SpringBootApplication
public class AlternativOktApp {

	public static void main(String[] args) {
		DataImportService.startImport();
		SpringApplication.run(AlternativOktApp.class, args);
	}

}