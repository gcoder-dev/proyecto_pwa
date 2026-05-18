package com.example.demo.manager.application.query.getId;

import com.example.demo.common.mediator.Request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetManagerRequest implements Request<GetManagerResponse> {
    private Long id;
}
