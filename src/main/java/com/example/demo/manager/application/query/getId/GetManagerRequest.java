package com.example.demo.manager.application.query.getId;

import com.example.demo.common.mediator.Request;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GetManagerRequest implements Request<GetManagerResponse> {
    private Long id;
}
