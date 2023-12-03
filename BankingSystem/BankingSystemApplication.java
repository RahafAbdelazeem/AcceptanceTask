package com.task.BankingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankingSystemApplication {

	public  void main(String[] args) {

		SpringApplication.run(BankingSystemApplication.class, args);

	}
	@Bean
	public CustomerAccount CustomerAccount() {
		 return  new CustomerAccount("John Doe", 1000.0);

	}

	@Bean
	public InterestCalculation interestCalculator() {
		return new SimpleInterestCalculation();
	}
}

}
