package com.example.demo.product.infrastructure.database.repository;

import com.example.demo.product.infrastructure.database.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity , Long> {
}
