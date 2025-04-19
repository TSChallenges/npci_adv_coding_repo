package com.npci.bankdemo.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date timeStamp;
    private String transactionType;
    private Double amount;
    private String status;
    private String description;

    @ManyToOne
    private BankAccount bankAccount;
}
