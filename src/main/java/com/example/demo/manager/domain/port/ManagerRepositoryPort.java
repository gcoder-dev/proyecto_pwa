package com.example.demo.manager.domain.port;

import com.example.demo.manager.domain.entity.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerRepositoryPort {
    void upsert(Manager manager);

    void deleteById(Long id);

    Optional<Manager> findById(Long id);

    List<Manager> findAll();
}
