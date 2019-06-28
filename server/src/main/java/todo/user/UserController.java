package todo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/users")
	public @ResponseBody String addUser(@RequestParam String name, @RequestParam String password) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		userRepository.save(user);
		return "Saved";
	}

	@GetMapping(path = "/users")
	public @ResponseBody Iterable<User> getUsers() {
		return userRepository.findAll();
	}
}