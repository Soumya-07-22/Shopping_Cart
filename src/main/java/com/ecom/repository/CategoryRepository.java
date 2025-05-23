package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public Boolean existByName(String name);
	
}
