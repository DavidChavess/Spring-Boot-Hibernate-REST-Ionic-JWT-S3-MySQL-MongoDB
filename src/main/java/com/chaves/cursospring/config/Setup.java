package com.chaves.cursospring.config;

import com.chaves.cursospring.entity.Category;
import com.chaves.cursospring.entity.Product;
import com.chaves.cursospring.repository.CategoryRepository;
import com.chaves.cursospring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Arrays;

@Configuration
public class Setup implements CommandLineRunner {

    @Autowired
    private CategoryRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Clothers");
        Category c3 = new Category(null, "Shoes");
        Category c4 = new Category(null, "Televisions");

        Product p1 = new Product(null, "Nike revolution 5", new BigDecimal("299.99"));
        Product p2 = new Product(null, "TV", new BigDecimal("1550.00"));

        p1.getCategories().addAll(Arrays.asList(c2, c3));
        p2.getCategories().addAll(Arrays.asList(c1,c4));

        c2.getProducts().add(p1);
        c3.getProducts().add(p1);
        c1.getProducts().add(p2);
        c4.getProducts().add(p2);

        repository.saveAll(Arrays.asList(c1, c2, c3, c4));
        productRepository.saveAll(Arrays.asList(p1,p2));

    }
}
