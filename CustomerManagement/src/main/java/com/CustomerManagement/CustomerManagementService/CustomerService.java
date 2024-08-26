package com.CustomerManagement.CustomerManagementService;

import com.CustomerManagement.CustomerManagementDTO.CustomerDto;
import com.CustomerManagement.Utilities.BankResponse;

public interface CustomerService {
   BankResponse createcontact(CustomerDto customerDto);
}