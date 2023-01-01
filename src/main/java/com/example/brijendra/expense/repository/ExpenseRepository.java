package com.example.brijendra.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.brijendra.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
