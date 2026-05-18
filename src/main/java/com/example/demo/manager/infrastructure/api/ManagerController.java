package com.example.demo.manager.infrastructure.api;

import com.example.demo.common.mediator.Mediator;
import com.example.demo.manager.application.command.create.CreateManagerRequest;
import com.example.demo.manager.application.command.delete.DeleteManagerRequest;
import com.example.demo.manager.application.command.update.UpdateManagerRequest;
import com.example.demo.manager.application.query.getAll.GetManagersRequest;
import com.example.demo.manager.application.query.getAll.GetManagersResponse;
import com.example.demo.manager.application.query.getId.GetManagerRequest;
import com.example.demo.manager.application.query.getId.GetManagerResponse;
import com.example.demo.manager.infrastructure.api.dtos.CreateManagerDto;
import com.example.demo.manager.infrastructure.api.dtos.ManagerDto;
import com.example.demo.manager.infrastructure.api.dtos.UpdateManagerDto;
import com.example.demo.manager.infrastructure.api.mapper.ManagerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/manager")
@RequiredArgsConstructor
public class ManagerController implements ManagerAPI {
    private final Mediator mediator;
    private final ManagerMapper managerMapper;

    @Override
    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateManagerDto dto) {
        CreateManagerRequest request = managerMapper.mapToCreateRequest(dto);
        mediator.dispatch(request);
        return ResponseEntity.ok(Map.of("status", "created"));
    }

    @Override
    @PutMapping
    public ResponseEntity<?> update(@RequestBody UpdateManagerDto dto) {
        UpdateManagerRequest request = managerMapper.mapToUpdateRequest(dto);
        mediator.dispatch(request);
        return ResponseEntity.noContent().build();
    }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<ManagerDto> dto = mediator.dispatch(new GetManagersRequest()).getManagers()
                .stream()
                .map(managerMapper::mapToManagerDto)
                .toList();


        return ResponseEntity.ok(dto);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        GetManagerRequest request = GetManagerRequest.builder().id(id).build();
        GetManagerResponse dispatch = mediator.dispatch(request);
        ManagerDto dto = managerMapper.mapToManagerDto(dispatch.getManager());
        return  ResponseEntity.ok(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        mediator.dispatch(DeleteManagerRequest.builder().id(id).build());
        return ResponseEntity.accepted().build();
    }
}
