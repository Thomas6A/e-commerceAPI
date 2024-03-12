package co.simplon.ecommerce.business.service.user;

import co.simplon.ecommerce.business.dto.UserDTO;

public interface IUserService {
	
	public void createUser(UserDTO user);
	
	public void deleteUser(UserDTO user);

}
