package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dto.User;
import Repository.UserRepository;

@Service
public class userService {

	@Autowired
	private UserRepository repository;
	
	public void saveUser(User user) {
		repository.saveUser(user);
	}
	
	public List<User> getUsers() {
		return repository.getUsers();
	}
	public User getUsersById()
	{
		return repository.getUsersById(0);
	}
}
