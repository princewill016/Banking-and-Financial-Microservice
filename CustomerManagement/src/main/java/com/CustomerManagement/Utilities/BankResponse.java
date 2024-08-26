package com.CustomerManagement.Utilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankResponse {

   public  String responseCode;
   public   String responseMessage;
   public AccountInfo accountInfo;
}