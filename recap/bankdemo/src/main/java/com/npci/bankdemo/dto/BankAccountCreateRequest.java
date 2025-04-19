package com.npci.bankdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountCreateRequest {

    private Long customerId;
    private String type;
    private String branch;
}
