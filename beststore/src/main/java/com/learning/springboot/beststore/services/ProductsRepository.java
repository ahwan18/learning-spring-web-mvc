package com.learning.springboot.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springboot.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
