package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction,Long>{

}
