package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.products;

@Repository
public interface ProductRepo  extends JpaRepository<products, String>{

	public products findByCategory(String category);
}
