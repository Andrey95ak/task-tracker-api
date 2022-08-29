package org.example.crazytasktrackerapi.api.controllers.helpers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.crazytasktrackerapi.api.exceptions.NotFoundException;
import org.example.crazytasktrackerapi.store.entities.ProjectEntity;
import org.example.crazytasktrackerapi.store.repositories.ProjectRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
@Transactional
public class ControllerHelper {

    ProjectRepository projectRepository;

    public ProjectEntity getProjectOrThrowException(Long projectId) {

        return projectRepository
                .findById(projectId)
                .orElseThrow(() ->
                        new NotFoundException(String.format(
                                "Project with \"%s\" already exist`s", projectId
                        )));

    }

}
