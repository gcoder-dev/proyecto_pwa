package com.example.demo.manager.domain.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Manager {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String image;
}
