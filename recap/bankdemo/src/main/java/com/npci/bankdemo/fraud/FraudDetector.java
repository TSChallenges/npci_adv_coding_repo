package com.npci.bankdemo.fraud;

import com.npci.bankdemo.dao.BankAccount;
import com.npci.bankdemo.dao.Transaction;

import java.util.Date;

public class FraudDetector {

    public static boolean detectFraud(BankAccount bankAccount, Transaction transaction){
        boolean isFraud = false;

        Date curTransactionTime = transaction.getTimeStamp();

//        if (bankAccount.getTransactionHistory() != null && bankAccount.getTransactionHistory().size() > 0 ){
//            // Add the logic to identify the fraud
//            // For Ex:  If transfer is happening to the same account multiple times within a minute
//            // get all the transactions in last one min of type TRANSFER and check the toAccount
//            Transaction prevTransaction = bankAccount.getTransactionHistory().get(bankAccount.getTransactionHistory().size() - 1);
//            Date prevTranscationTime = prevTransaction.getTimeStamp();
//            Long diff = curTransactionTime.getTime() - prevTranscationTime.getTime();
//            if (diff < 50000){
//                isFraud = true;
//            }
//        }
        return isFraud;
    }
}
