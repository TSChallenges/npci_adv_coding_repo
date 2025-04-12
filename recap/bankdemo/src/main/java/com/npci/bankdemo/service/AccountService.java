package com.npci.bankdemo.service;

import com.npci.bankdemo.dao.BankAccount;
import com.npci.bankdemo.dao.Customer;
import com.npci.bankdemo.dao.Transaction;
import com.npci.bankdemo.fraud.FraudDetector;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class AccountService {

    private static List<BankAccount> bankAccounts = new ArrayList<>();

    //    Create Account	- POST:/accounts		- Body	(customerId, type, branch)
    public ResponseEntity<BankAccount> createAccount(BankAccount bankAccount){
        bankAccount.setAccountNumber(new Random().nextLong());
        bankAccounts.add(bankAccount);
        return new ResponseEntity<>(bankAccount, HttpStatus.CREATED);
    }


    //    Deposit		- PUT:/accounts/deposit/{id}	- Body  (accountId, amount)
    public ResponseEntity<String> depositAmount(Long accountNumber, Double amount){

        try {
            BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
            System.out.println("Account Validated");
            bankAccount.setBalance(bankAccount.getBalance() + amount);

            addTransactionToHistory(bankAccount, "DEPOSIT", amount, "COMPLETED");
            return new ResponseEntity<>("Amount deposited : " + amount, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Account not found.", HttpStatus.NOT_FOUND);
        }

    }


    //    Withdraw		- PUT:/accounts/withdraw/{id}	- Body  (accountId, amount)
    public ResponseEntity<String> withdrawAmount( Long accountNumber,  Double amount){
        try{
            BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
            // Validation
            if (bankAccount.getBalance() < amount){
                System.out.println("Couldnt process the withdraw request due to insufficient balance.");
                return new ResponseEntity<>("Insufficient Balance", HttpStatus.OK);
            }

            bankAccount.setBalance(bankAccount.getBalance() - amount);
            addTransactionToHistory(bankAccount, "WITHDRAW", amount, "COMPLETED");
            return new ResponseEntity<>("Amount withdrawn : " + amount, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Account not found.", HttpStatus.NOT_FOUND);
        }

    }

    //    Check Balance		- GET:/accounts/checkBalance/{id}
    public ResponseEntity<Object> checkBalance(Long accountNumber){
        try{
            BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
            return new ResponseEntity<>(bankAccount.getBalance(), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Account not found.", HttpStatus.NOT_FOUND);
        }
    }

    //    Transfer		- PUT:/accounts/transfer/{id}	- Body	(fromAccountId, toAccountId, amount)
    public ResponseEntity<String> transfer(Long fromId, Long toId, Double amount){
        BankAccount fromAccount;
        try{
            fromAccount = findAccountByAccountNumber(fromId);
        }catch (Exception ex){
            return new ResponseEntity<>("From Account not found.", HttpStatus.NOT_FOUND);
        }
        try{
            BankAccount toAccount = findAccountByAccountNumber(toId);
            // Validation
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);

            addTransactionToHistory(fromAccount, "TRANSFER", amount, "COMPLETED");
            addTransactionToHistory(toAccount, "RECEIVE", amount, "COMPLETED");

            return new ResponseEntity<>("Transferred amount successfully", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("To Account not found.", HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<List<BankAccount>> getAllAccount(){
        return new ResponseEntity<>(bankAccounts, HttpStatus.OK);
    }

    public ResponseEntity<Object> getAccount(Long accountNumber){
        try {
            BankAccount account = findAccountByAccountNumber(accountNumber);
            return new ResponseEntity<>(account, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Account not found.", HttpStatus.NOT_FOUND);
        }
    }

    private void addTransactionToHistory(BankAccount bankAccount, String transactionType, Double amount, String status){
        Transaction transaction = new Transaction();
        transaction.setId(new Random().nextLong());
        transaction.setTransactionType(transactionType);
        transaction.setAmount(amount);
        transaction.setStatus(status);
        transaction.setTimeStamp(new Date());

        bankAccount.getTransactionHistory().add(transaction);
        if (FraudDetector.detectFraud(bankAccount,transaction)){
            System.out.println("Suspected Fraud with this transaction");
            transaction.setDescription("Suspected Fraud with this transaction");
        }
    }


    private BankAccount findAccountByAccountNumber(Long accountNumber) throws Exception {
        for(BankAccount b: bankAccounts){
            if (b.getAccountNumber().equals(accountNumber)){
                return b;
            }
        }
        throw new Exception("Account Not Found");
    }




}
