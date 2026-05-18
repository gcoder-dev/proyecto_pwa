package com.example.demo.manager.infrastructure.database.repository;

import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import com.example.demo.manager.infrastructure.database.mapper.ManagerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ManagerRepositoryImp implements ManagerRepositoryPort {
    private final ManagerEntityMapper managerEntityMapper;
    private final JpaManagerRepository jpaManagerRepository;

    @Override
    public void upsert(Manager manager) {
         jpaManagerRepository.save(
                 managerEntityMapper.mapToManagerEntity(manager)
         );
    }

    @Override
    public void deleteById(Long id) {
        jpaManagerRepository.deleteById(id);
    }

    @Override
    public Optional<Manager> findById(Long id) {
        return jpaManagerRepository.findById(id)
                .stream()
                .findFirst()
                .map(managerEntityMapper::mapToManager);
    }

    @Override
    public List<Manager> findAll() {
        return jpaManagerRepository.findAll()
                .stream()
                .map(managerEntityMapper::mapToManager)
                .toList();
    }
}
