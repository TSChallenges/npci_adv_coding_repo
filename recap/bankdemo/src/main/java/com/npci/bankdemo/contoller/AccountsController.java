package com.npci.bankdemo.contoller;

import com.npci.bankdemo.dao.BankAccount;
import com.npci.bankdemo.dto.BankAccountCreateRequest;
import com.npci.bankdemo.service.AccountService;
import org.apache.logging.log4j.simple.SimpleLogger;
import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    AccountService accountService;

//    Create Account	- POST:/accounts		- Body	(customerId, type, branch)
    @PostMapping("")
    public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccountCreateRequest request){
        System.out.println("In createAccount - customer Id = " + request.getCustomerId());

        BankAccount account = new BankAccount();
        account.setCustomerId(request.getCustomerId());
        account.setType(request.getType());
        account.setBranch(request.getBranch());
        ResponseEntity<BankAccount> accountResponse =  accountService.createAccount(account);

        System.out.println("Account Created "+ accountResponse.getBody().getAccountNumber());
        return accountResponse;
    }


//    Deposit		- PUT:/accounts/deposit/{id}	- Body  (accountId, amount)
    @PutMapping("/deposit/{id}/{amount}")
    public ResponseEntity<String> depositAmount(@PathVariable("id") Long accountId, @PathVariable("amount") Double amount){
        System.out.println("In deposit " + accountId + " " + amount);
        return accountService.depositAmount(accountId,amount);
    }


//    Withdraw		- PUT:/accounts/withdraw/{id}	- Body  (accountId, amount)
    @PutMapping("/withdraw/{id}/{amount}")
    public ResponseEntity<String> withdrawAmount(@PathVariable("id") Long accountId, @PathVariable("amount") Double amount){
        return accountService.withdrawAmount(accountId,amount);
    }

//    Check Balance		- GET:/accounts/checkBalance/{id}
    @GetMapping("/checkBalance/{id}")
    public ResponseEntity<Object> checkBalance(@PathVariable("id") Long accountId){
        return accountService.checkBalance(accountId);
    }

//    Transfer		- PUT:/accounts/transfer/{id}	- Body	(fromAccountId, toAccountId, amount)
    @PutMapping("/transfer/{fromId}/{toId}/{amount}")
    public ResponseEntity<String> transfer(@PathVariable("fromId") Long fromId, @PathVariable("toId") Long toId, @PathVariable("amount") Double amount){
        return accountService.transfer(fromId,toId,amount);
    }

    @GetMapping("")
    public ResponseEntity<List<BankAccount>> getAllAccounts(){
        return accountService.getAllAccount();
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<Object> getAccount(@PathVariable("accountNumber") Long accountNumber){
        return accountService.getAccount(accountNumber);
    }


}
