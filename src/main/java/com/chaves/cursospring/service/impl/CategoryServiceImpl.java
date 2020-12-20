package com.chaves.cursospring.service.impl;

import com.chaves.cursospring.entity.Category;
import com.chaves.cursospring.repository.CategoryRepository;
import com.chaves.cursospring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;


    @Override
    public Category getById(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
