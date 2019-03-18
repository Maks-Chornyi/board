package nl.mycubes.board.web;

import nl.mycubes.board.domain.ProjectTask;
import nl.mycubes.board.service.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/board")
@RestController
@CrossOrigin
public class ProjectTaskController {

    @Autowired
    ProjectTaskService projectTaskService;

    @PostMapping("")
    public ResponseEntity<?> addPTToBoard(@RequestBody ProjectTask projectTask) {
            ProjectTask newProjectTask = projectTaskService.saveOrUpdateProjectTask(projectTask);
            return new ResponseEntity<ProjectTask>(newProjectTask, HttpStatus.CREATED);
    }

}
