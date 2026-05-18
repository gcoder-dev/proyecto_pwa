package com.example.demo.manager.application.query.getId;

import com.example.demo.common.mediator.RequestHandler;
import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.domain.exception.ManagerNotFound;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetManagerHandler implements RequestHandler<GetManagerRequest, GetManagerResponse> {
    private final ManagerRepositoryPort managerRepositoryPort;
    @Override
    public GetManagerResponse handler(GetManagerRequest request) {
        Manager manager = managerRepositoryPort.findById(request.getId())
                .orElseThrow(() -> new ManagerNotFound("Manager not found"));


        return GetManagerResponse.builder()
                .manager(manager)
                .build();
    }

    @Override
    public Class<GetManagerRequest> getRequestType() {
        return GetManagerRequest.class;
    }
}
