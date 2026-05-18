package com.example.demo.category.infrastructure.database.mapper;


import com.example.demo.category.domain.entity.Category;
import com.example.demo.category.infrastructure.database.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel =  MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CategoryEntityMapper {
    Category mapToCategory(CategoryEntity categoryEntity);

    CategoryEntity maptToCategoryEntity(Category category);
}
