package co.simplon.ecommerce.presentation.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.UserDTO;
import co.simplon.ecommerce.business.service.user.IUserService;

@CrossOrigin
@RestController
public class CreateUserController {
	
	private IUserService service;
	
	@PostMapping("/user")
	public void createUser(@RequestBody UserDTO user) {
		service.createUser(user);
	}

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}
}
