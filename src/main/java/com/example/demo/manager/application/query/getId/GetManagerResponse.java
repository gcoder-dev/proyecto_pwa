package com.example.demo.manager.application.query.getId;

import com.example.demo.manager.domain.entity.Manager;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetManagerResponse {
    private Manager manager;
}
