package com.CustomerManagement.CustomerManagementService;

import com.CustomerManagement.CustomerManagementDTO.CustomerDto;
import com.CustomerManagement.CustomerManagementEntity.CustomerEntity;
import com.CustomerManagement.CustomerManagementRepository.CustomerRepository;
import com.CustomerManagement.Utilities.AccountInfo;
import com.CustomerManagement.Utilities.AccountUtils;
import com.CustomerManagement.Utilities.BankResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerServiceImpl implements  CustomerService{

   @Autowired
   private CustomerRepository customerRepository;
   @Override
   public BankResponse createcontact(CustomerDto customerDto) {
      CustomerEntity customer = CustomerEntity
            .builder()
            .accountPassword(customerDto.getAccountPassword())
            .age(customerDto.getAge())
            .accountNumber(AccountUtils.generateAccountNumber())
            .accountType("Savings")
            .address(customerDto.getAddress())
            .email(customerDto.getEmail())
            .createdAt(LocalDateTime.now())
            .gender(customerDto.getGender())
            .firstName(customerDto.getFirstName())
            .employmentStatus("Employed")
            .modifiedAt(LocalDateTime.now())
            .phone(customerDto.getPhone())
            .nextOfKin(customerDto.getNextOfKin())
            .lastName(customerDto.getLastName())
            .maritalStatus("Single")
            .nextOfKinPhone(customerDto.getNextOfKinPhone())
            .otherName(customerDto.getOtherName())
            .stateOfOrigin(customerDto.getStateOfOrigin())
            .nextOfKinAddress(customerDto.getNextOfKinAddress())
            .isActive(true)
            .build();
     CustomerEntity savedCustomer =  customerRepository.save(customer);
      return  BankResponse.builder()
            .responseCode(AccountUtils.RESPONSE)
            .responseMessage(AccountUtils.RESPONSE_MESSAGE)
            .accountInfo(AccountInfo.builder()
                  .accountID(savedCustomer.getId()).accountNumber(savedCustomer.getAccountNumber()).accountName(savedCustomer.getFirstName()+ " " + savedCustomer.getLastName()+ " " + savedCustomer.getOtherName()).build()).build();
   }
}