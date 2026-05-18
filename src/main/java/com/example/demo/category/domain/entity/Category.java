package com.example.demo.category.domain.entity;

import com.example.demo.manager.domain.entity.Manager;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    private Long id;
    private String name;
    private String image;

    private Manager manager;
}
