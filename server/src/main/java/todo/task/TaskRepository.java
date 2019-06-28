package todo.task;

import org.springframework.data.repository.CrudRepository;

import todo.task.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}