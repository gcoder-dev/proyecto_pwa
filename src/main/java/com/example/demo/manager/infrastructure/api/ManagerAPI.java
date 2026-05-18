package com.example.demo.manager.infrastructure.api;

import com.example.demo.manager.infrastructure.api.dtos.CreateManagerDto;
import com.example.demo.manager.infrastructure.api.dtos.UpdateManagerDto;
import org.springframework.http.ResponseEntity;

public interface ManagerAPI {
    ResponseEntity<?> create(CreateManagerDto dto);

    ResponseEntity<?> update(UpdateManagerDto dto);

    ResponseEntity<?> findAll();

    ResponseEntity<?> findById(Long id);

    ResponseEntity<?> deleteById(Long id);
}
