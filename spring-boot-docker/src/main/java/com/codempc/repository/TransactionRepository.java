package com.codempc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codempc.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
