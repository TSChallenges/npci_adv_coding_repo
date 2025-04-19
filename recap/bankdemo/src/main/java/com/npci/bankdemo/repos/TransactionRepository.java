package com.npci.bankdemo.repos;

import com.npci.bankdemo.dao.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
