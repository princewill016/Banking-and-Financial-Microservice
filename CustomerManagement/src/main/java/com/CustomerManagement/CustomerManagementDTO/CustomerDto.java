package com.CustomerManagement.CustomerManagementDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
   private String firstName;
   private String lastName;
   private String otherName;
   private String address;
   private String email;
   private String phone;
   private int age;
   private char gender;
   private String accountPassword;
   private String stateOfOrigin;
   private  String employmentStatus;
   private String accountType;
   private String maritalStatus;
   private String nextOfKin;
   private String nextOfKinPhone;
   private String nextOfKinAddress;
}