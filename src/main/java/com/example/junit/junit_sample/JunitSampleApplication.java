package com.example.junit.junit_sample;

import com.example.junit.junit_sample.calculator.Calculator;
import com.example.junit.junit_sample.calculator.DivideInt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitSampleApplication.class, args);

		Calculator<Integer> calculator = new Calculator<>(new DivideInt());
		calculator.calculate(10, 10);
	}

}
