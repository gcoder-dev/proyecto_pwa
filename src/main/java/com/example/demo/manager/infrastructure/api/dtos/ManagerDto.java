package com.example.demo.manager.infrastructure.api.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManagerDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String image;
}
