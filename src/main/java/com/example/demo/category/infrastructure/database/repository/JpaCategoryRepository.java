package com.example.demo.category.infrastructure.database.repository;

import com.example.demo.category.infrastructure.database.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
