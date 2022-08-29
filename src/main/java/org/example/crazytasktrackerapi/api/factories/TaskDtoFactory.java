package org.example.crazytasktrackerapi.api.factories;

import org.example.crazytasktrackerapi.api.dto.TaskDto;
import org.example.crazytasktrackerapi.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .createdAt(entity.getCreatedAt())
                .build();

    }

}
