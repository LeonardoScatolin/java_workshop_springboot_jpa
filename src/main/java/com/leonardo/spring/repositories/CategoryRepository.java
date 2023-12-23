package com.leonardo.spring.repositories;

import com.leonardo.spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
