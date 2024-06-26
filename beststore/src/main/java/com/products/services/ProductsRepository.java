package com.products.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
