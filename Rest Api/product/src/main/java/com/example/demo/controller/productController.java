package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Product;
import com.example.demo.repositry.ProductRepo;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin("http://localhost:4200")
public class productController {
	
	@Autowired
	ProductRepo repo;
	@RequestMapping("/product")
	public String home()
	{
		return "Product Home";
	}
	@PostMapping("/add")
	public void add(@RequestBody Product producer)
	{
		repo.save(producer);
	}
	@GetMapping("/showAll")
	public List<Product> showAll(){
		List<Product>list=repo.findAll();
		return list;
	}
	@GetMapping("/search-by-Id/{id}")
	public List<Product> searchById(@PathVariable int id){
		List<Product>list=null;
		list=repo.findByProId(id);
		return list;
	}
	@GetMapping("range/{pin}/{pend}")
	public List<Product> priceRange(@PathVariable float pin,@PathVariable float pend)
	{
		List<Product>list=repo.findAll();
		
		List<Product> lst=new ArrayList<Product>();
		
		for(Product p: list) {
			if(p.getPorductPrice()>=pin && p.getPorductPrice()<=pend)
			{
				
				lst.add(p);
			}
		}
		return lst;
	}
}
