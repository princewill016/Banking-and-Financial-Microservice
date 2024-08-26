package com.CustomerManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {
   public static void main(String[] args){
      SpringApplication.run(CustomerApplication.class, args);
   }
}