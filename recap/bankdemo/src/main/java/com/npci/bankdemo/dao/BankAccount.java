package com.npci.bankdemo.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;

    private Long customerId;

    private Double balance = 0.0;
    private String type;
    private String branch;

    @OneToMany(mappedBy = "bankAccount", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Transaction> transactionHistory = new ArrayList<>();

}
