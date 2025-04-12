package com.npci.bankdemo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    private Long customerId;
    private Long accountNumber;
    private Double balance = 0.0;
    private String type;
    private String branch;
    private List<Transaction> transactionHistory = new ArrayList<>();

}
