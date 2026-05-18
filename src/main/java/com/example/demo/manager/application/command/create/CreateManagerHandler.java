package com.example.demo.manager.application.command.create;

import com.example.demo.common.mediator.RequestHandler;
import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateManagerHandler implements RequestHandler<CreateManagerRequest, Void> {
    private final ManagerRepositoryPort managerRepositoryPort;


    @Override
    public Void handler(CreateManagerRequest request) {
        Manager manager = Manager
                .builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .image(request.getImage())
                .build();

        managerRepositoryPort.upsert(manager);
        return null;
    }

    @Override
    public Class<CreateManagerRequest> getRequestType() {
        return CreateManagerRequest.class;
    }
}
