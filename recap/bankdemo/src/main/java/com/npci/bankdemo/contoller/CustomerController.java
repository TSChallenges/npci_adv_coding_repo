package com.npci.bankdemo.contoller;

import com.npci.bankdemo.dao.Customer;
import com.npci.bankdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    Add Customer		- POST:/cutomers		- Body	(name, email, address)
    @PostMapping("")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }


//    Delete Customer	- DELETE:/cutomers/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId){
        return customerService.deleteCustomer(customerId);
    }


//    Update Customer	- PUT:/cutomers/{id}		- Body  (name, email, address)
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);

    }


//    Get Customer Details	- GET:/cutomers
    @GetMapping("")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return customerService.getAllCustomers();

    }

//			- GET:/cutomers/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);

    }



}
