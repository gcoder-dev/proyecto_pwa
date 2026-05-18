package com.example.demo.manager.application.command.create;

import com.example.demo.common.mediator.Request;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateManagerRequest implements Request<Void> {
    private String name;
    private String email;
    private String password;
    private String image;
}
