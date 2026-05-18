package com.example.demo.manager.application.command.update;

import com.example.demo.common.mediator.RequestHandler;
import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.domain.exception.ManagerNotFound;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateManagerHandler implements RequestHandler<UpdateManagerRequest, Void> {
    private final ManagerRepositoryPort managerRepositoryPort;


    @Override
    public Void handler(UpdateManagerRequest request) {

        Manager manager = managerRepositoryPort.findById(request.getId() )
                .orElseThrow(() -> new ManagerNotFound("Manager not found"));


        manager.setEmail(request.getEmail());
        manager.setPassword(request.getPassword());
        manager.setImage(request.getImage());
        manager.setName(request.getName());


        managerRepositoryPort.upsert(manager);
        return null;
    }

    @Override
    public Class<UpdateManagerRequest> getRequestType() {
        return UpdateManagerRequest.class;
    }
}
