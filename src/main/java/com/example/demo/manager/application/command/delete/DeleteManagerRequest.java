package com.example.demo.manager.application.command.delete;

import com.example.demo.common.mediator.Request;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteManagerRequest implements Request<Void> {
    Long id;
}
