package com.npci.bankdemo.service;

import com.npci.bankdemo.dao.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CustomerService {

    private static List<Customer> customerList = new ArrayList<>();

    public ResponseEntity<Customer> addCustomer(Customer customer){
        Random random = new Random();
        Long randomId = random.nextLong();
        customer.setId(randomId);
        customerList.add(customer);

        return new ResponseEntity<>(customer, HttpStatus.CREATED );
    }

    public ResponseEntity<String> deleteCustomer(Long customerId){
        Customer customer = findCustomerById(customerId);
        customerList.remove(customer);
        return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
    }


    public ResponseEntity<Customer> updateCustomer(Long customerId, Customer customer){
        Customer c = findCustomerById(customerId);
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
        return new ResponseEntity<>(customer, HttpStatus.OK );
    }


    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    public ResponseEntity<Customer> getCustomer(Long customerId){
        Customer customer = findCustomerById(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK );
    }

    private Customer findCustomerById(Long customerId){
        for(Customer c: customerList){
            if (c.getId().equals(customerId)){
                return c;
            }
        }
        return null;
    }

}
