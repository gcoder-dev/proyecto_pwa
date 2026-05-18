package com.example.demo.category.infrastructure.database.repository;

import com.example.demo.category.domain.entity.Category;
import com.example.demo.category.domain.port.CategoryRepositoryPort;
import com.example.demo.category.infrastructure.database.entity.CategoryEntity;
import com.example.demo.category.infrastructure.database.mapper.CategoryEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryImp implements CategoryRepositoryPort  {
    private final JpaCategoryRepository jpaCategoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Override
    public void upsert(Category category) {
        CategoryEntity categoryEntity = categoryEntityMapper.maptToCategoryEntity(category);
        jpaCategoryRepository.save(categoryEntity);
    }

    @Override
    public void deleteById(Long id) {
        jpaCategoryRepository.deleteById(id);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return jpaCategoryRepository.findById(id)
                .stream()
                .findFirst()
                .map(categoryEntityMapper::mapToCategory);
    }

    @Override
    public List<Category> findAll() {
        return jpaCategoryRepository.findAll()
                .stream()
                .map(categoryEntityMapper::mapToCategory)
                .toList();
    }
}
