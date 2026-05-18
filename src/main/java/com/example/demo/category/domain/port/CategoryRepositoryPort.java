package com.example.demo.category.domain.port;

import com.example.demo.category.domain.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryPort {
    void upsert(Category category);

    void deleteById(Long id);

    Optional<Category> findById(Long id);

    List<Category> findAll();
}
