package com.example.demo.manager.infrastructure.database.mapper;


import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.infrastructure.database.entity.ManagerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ManagerEntityMapper {
    Manager mapToManager(ManagerEntity managerEntity);
    ManagerEntity mapToManagerEntity(Manager manager);
}
