package com.example.demo.product.infrastructure.database.repository;

import com.example.demo.product.domain.entity.Product;
import com.example.demo.product.domain.port.ProductRepositoryPort;
import com.example.demo.product.infrastructure.database.mapper.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImp implements ProductRepositoryPort {
    private final JpaProductRepository jpaProductRepository;
    private final ProductEntityMapper productEntityMapper;

    @Override
    public void upsert(Product product) {
        jpaProductRepository.save(
                productEntityMapper.mapToProductEntity(product)
        );
    }

    @Override
    public void deleteById(Long id) {
        jpaProductRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return jpaProductRepository.findById(id)
                .stream()
                .findFirst()
                .map(productEntityMapper::mapToProduct);
    }

    @Override
    public List<Product> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(productEntityMapper::mapToProduct)
                .toList();
    }
}
