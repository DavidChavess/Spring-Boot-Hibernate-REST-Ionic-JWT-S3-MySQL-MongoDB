package com.chaves.cursospring.repository;

import com.chaves.cursospring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> { }
