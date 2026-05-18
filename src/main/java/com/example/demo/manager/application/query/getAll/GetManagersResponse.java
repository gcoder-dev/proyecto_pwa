package com.example.demo.manager.application.query.getAll;

import com.example.demo.manager.domain.entity.Manager;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetManagersResponse {
    private List<Manager> managers;
}
