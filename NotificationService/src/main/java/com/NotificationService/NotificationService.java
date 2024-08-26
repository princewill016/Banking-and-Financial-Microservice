package com.NotificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class NotificationService {
   public static void main(String[] args) {
      SpringApplication.run(NotificationService.class, args);
   }
}