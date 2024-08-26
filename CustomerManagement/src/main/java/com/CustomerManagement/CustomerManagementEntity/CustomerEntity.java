package com.CustomerManagement.CustomerManagementEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@Table( name = "Customer")
public class CustomerEntity {
   @GeneratedValue(strategy = GenerationType.UUID)
   @Id
   private String id;
   private  String accountNumber;
   private String firstName;
   private String email;
   private String lastName;
   private String otherName;
   private String address;
   private String phone;
   private int age;
   private char gender;
   private String accountPassword;
   private String stateOfOrigin;
   private  String employmentStatus;
   private String maritalStatus;
   private boolean isActive;
   @CreationTimestamp
   private LocalDateTime createdAt;
   @UpdateTimestamp
   private LocalDateTime modifiedAt;
   private String accountType;
   private String nextOfKin;
   private String nextOfKinPhone;
   private String nextOfKinAddress;


}