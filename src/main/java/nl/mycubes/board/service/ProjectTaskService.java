package nl.mycubes.board.service;

import nl.mycubes.board.domain.ProjectTask;
import nl.mycubes.board.repository.ProjectTaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    ProjectTaskRepo projectTaskRepo;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask) {

        String status = projectTask.getStatus();
        if (status == null || status.equals("")) {
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepo.save(projectTask);
    }
}
