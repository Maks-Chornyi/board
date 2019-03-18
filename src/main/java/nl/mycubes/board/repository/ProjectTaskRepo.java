package nl.mycubes.board.repository;

import nl.mycubes.board.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepo extends CrudRepository<ProjectTask, Long> {
}
