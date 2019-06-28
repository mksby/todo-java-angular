package todo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class TaskController {
	@Autowired
	private TaskRepository taskRepository;

	@PostMapping(path = "/tasks")
	public @ResponseBody String addTask(@RequestParam String title, @RequestParam String description) {
		Task task = new Task();
		task.setTitle(title);
		task.setDescription(description);
		taskRepository.save(task);
		return "Saved";
	}

	@CrossOrigin()
	@GetMapping(path = "/tasks")
	public @ResponseBody Iterable<Task> getTasks() {
		return taskRepository.findAll();
	}
}