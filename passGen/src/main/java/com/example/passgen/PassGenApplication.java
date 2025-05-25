package com.example.passgen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PassGenApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PassGenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator(scanner);
        generator.mainLoop();
        scanner.close();
    }
}
