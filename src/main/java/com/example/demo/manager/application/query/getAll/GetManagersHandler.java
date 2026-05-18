package com.example.demo.manager.application.query.getAll;

import com.example.demo.common.mediator.RequestHandler;
import com.example.demo.manager.domain.entity.Manager;
import com.example.demo.manager.domain.port.ManagerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetManagersHandler implements RequestHandler<GetManagersRequest, GetManagersResponse> {
    private ManagerRepositoryPort managerRepositoryPort;


    @Override
    public GetManagersResponse handler(GetManagersRequest request) {
        List<Manager> managers = managerRepositoryPort.findAll();
        return GetManagersResponse
                .builder()
                .managers(managers)
                .build();
    }

    @Override
    public Class<GetManagersRequest> getRequestType() {
        return GetManagersRequest.class;
    }
}
