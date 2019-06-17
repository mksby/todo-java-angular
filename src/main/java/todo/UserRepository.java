package todo;

import org.springframework.data.repository.CrudRepository;

import todo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}