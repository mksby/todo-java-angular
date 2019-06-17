package todo;

import org.springframework.data.repository.CrudRepository;

import todo.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}