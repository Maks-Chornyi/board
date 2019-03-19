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

    public Iterable<ProjectTask> findAll() {
        return projectTaskRepo.findAll();
    }

    public ProjectTask findById(Long id) {
        return projectTaskRepo.getById(id);
    }

    public void deletePTById(Long id) {
        ProjectTask projectTask = findById(id);
        projectTaskRepo.delete(projectTask);
    }
}

