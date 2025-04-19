package com.npci.bankdemo.service;

import com.npci.bankdemo.dao.Customer;
import com.npci.bankdemo.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CustomerService {

//    private static List<Customer> customerList = new ArrayList<>();

    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity<Customer> addCustomer(Customer customer){
//        Random random = new Random();
//        Long randomId = random.nextLong();
//        customer.setId(randomId);
//        customerList.add(customer);
        customer = customerRepository.save(customer);

        return new ResponseEntity<>(customer, HttpStatus.CREATED );
    }

    public ResponseEntity<String> deleteCustomer(Long customerId){
        Customer customer = findCustomerById(customerId);
//        customerList.remove(customer);

        customerRepository.delete(customer);

        return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
    }


    public ResponseEntity<Customer> updateCustomer(Long customerId, Customer customer){
        Customer c = findCustomerById(customerId);
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
        customerRepository.save(c);
        return new ResponseEntity<>(customer, HttpStatus.OK );
    }


    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer>  customerList = customerRepository.findAll();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    public ResponseEntity<Customer> getCustomer(Long customerId){
        Customer customer = findCustomerById(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK );
    }

    private Customer findCustomerById(Long customerId){
//        for(Customer c: customerList){
//            if (c.getId().equals(customerId)){
//                return c;
//            }
//        }

        Optional<Customer> customerOptional =  customerRepository.findById(customerId);
        return customerOptional.orElse(null);
    }

}
