package com.example.demo.manager.infrastructure.database.repository;

import com.example.demo.manager.infrastructure.database.entity.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaManagerRepository extends JpaRepository<ManagerEntity, Long> {
}
