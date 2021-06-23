package com.codempc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codempc.model.Transaction;
import com.codempc.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	public void saveTransaction(Transaction transaction) {

		transactionRepository.save(transaction);

	}
	
	public Iterable<Transaction> getTransactionHistory(){

		return transactionRepository.findAll();

	}

	public Optional<Transaction> getTransationNyId(Long id){
		return transactionRepository.findById(id);
	}

}
