package com.CustomerManagement.CustomerManagementController;

import com.CustomerManagement.CustomerManagementDTO.CustomerDto;
import com.CustomerManagement.CustomerManagementService.CustomerService;
import com.CustomerManagement.Utilities.BankResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("api/v3/customer")
public class CustomerController {
   @Autowired
   private CustomerService customerService;


   @PostMapping("/create-account")
   public BankResponse createAccount(@RequestBody CustomerDto CustomerDto){
      return customerService.createcontact(CustomerDto);
   }
}