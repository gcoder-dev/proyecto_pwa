package com.example.demo.manager.infrastructure.api.mapper;

import com.example.demo.manager.application.command.create.CreateManagerRequest;
import com.example.demo.manager.application.command.update.UpdateManagerRequest;
import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.infrastructure.api.dtos.CreateManagerDto;
import com.example.demo.manager.infrastructure.api.dtos.ManagerDto;
import com.example.demo.manager.infrastructure.api.dtos.UpdateManagerDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,  unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ManagerMapper {
    CreateManagerRequest mapToCreateRequest(CreateManagerDto createManagerDto);

    UpdateManagerRequest mapToUpdateRequest(UpdateManagerDto updateManagerDto);

    ManagerDto mapToManagerDto(Manager manager);
}
