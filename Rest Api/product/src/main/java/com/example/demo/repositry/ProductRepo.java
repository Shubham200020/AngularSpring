package com.example.demo.repositry;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	List<Product> findByProId(int proId);
	List<Product> findByPorductPrice(float porductPrice);
	
}
