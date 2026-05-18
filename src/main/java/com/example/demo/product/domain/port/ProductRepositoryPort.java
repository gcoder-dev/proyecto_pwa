package com.example.demo.product.domain.port;

import com.example.demo.product.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryPort {
    void upsert(Product product);

    void deleteById(Long id);

    Optional<Product> findById(Long id);


    List<Product> findAll();
}
