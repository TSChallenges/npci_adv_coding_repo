package com.npci.bankdemo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private Long id;
    private Date timeStamp;
    private String transactionType;
    private Double amount;
    private String status;
    private String description;
}
