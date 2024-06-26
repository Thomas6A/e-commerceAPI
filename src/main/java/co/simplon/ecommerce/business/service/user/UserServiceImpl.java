package co.simplon.ecommerce.business.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.ecommerce.business.convert.UserConvert;
import co.simplon.ecommerce.business.dto.UserDTO;
import co.simplon.ecommerce.persistance.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	private IUserRepository repo;

	@Override
	public void createUser(UserDTO user) {
		repo.save(UserConvert.getInstance().convertDTOToEntity(user));
		
	}

	@Override
	public void deleteUser(UserDTO user) {
		repo.delete(UserConvert.getInstance().convertDTOToEntity(user));
		
	}

	@Autowired
	public void setRepo(IUserRepository repo) {
		this.repo = repo;
	}
	
	

}
