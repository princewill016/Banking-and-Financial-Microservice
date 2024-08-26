package com.AccountManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountManagement {
   public static void main(String[] args) {
      SpringApplication.run(AccountManagement.class, args);
   }
}