package com.example.demo.manager.application.command.update;

import com.example.demo.common.mediator.Request;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateManagerRequest implements Request<Void> {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String image;
}
