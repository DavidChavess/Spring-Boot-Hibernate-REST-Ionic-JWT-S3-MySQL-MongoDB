package com.chaves.cursospring.repository;

import com.chaves.cursospring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> { }
