package com.example.demo.manager.application.command.delete;

import com.example.demo.common.mediator.RequestHandler;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteManagerHandler implements RequestHandler<DeleteManagerRequest, Void> {
    private final ManagerRepositoryPort managerRepositoryPort;

    @Override
    public Void handler(DeleteManagerRequest request) {
        managerRepositoryPort.deleteById(request.getId());
        return null;
    }

    @Override
    public Class<DeleteManagerRequest> getRequestType() {
        return null;
    }
}
