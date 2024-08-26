package com.CustomerManagement.CustomerManagementRepository;

import com.CustomerManagement.CustomerManagementEntity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
}