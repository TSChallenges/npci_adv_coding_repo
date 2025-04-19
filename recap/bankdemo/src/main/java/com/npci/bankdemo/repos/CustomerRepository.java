package com.npci.bankdemo.repos;

import com.npci.bankdemo.dao.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
