package com.leonardo.spring.repositories;

import com.leonardo.spring.entities.Category;
import com.leonardo.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
