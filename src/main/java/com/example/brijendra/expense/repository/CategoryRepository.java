package com.example.brijendra.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.brijendra.*;.expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
