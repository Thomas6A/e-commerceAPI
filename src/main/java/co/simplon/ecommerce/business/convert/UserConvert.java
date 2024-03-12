package co.simplon.ecommerce.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.ecommerce.business.dto.UserDTO;
import co.simplon.ecommerce.persistance.entity.User;

public class UserConvert {
	
	private static UserConvert instance;
	
	public static UserConvert getInstance() {
		if(instance == null) {
			instance = new UserConvert();
		}
		return instance;
	}
	
	public UserDTO convertEntityToDTO(User user) {
		UserDTO dto = new UserDTO();
		dto.setId(user.getId_user());
		dto.setUsername(user.getUsername());
		dto.setUser_password(user.getUser_password());
		dto.setUser_role(user.getUser_role());
		return dto;
	}
	
	public List<UserDTO> convertListEntityToListDTO(List<User> users){
		List<UserDTO> dtos = new ArrayList<UserDTO>();
		for (User user : users) {
			dtos.add(convertEntityToDTO(user));
		}
		return dtos;
	}
	
	public User convertDTOToEntity(UserDTO dto) {
		User user = new User();
		user.setId_user(dto.getId());
		user.setUsername(dto.getUsername());
		user.setUser_password(dto.getUser_password());
		user.setUser_role(dto.getUser_role());
		return user;
	}
	
	public List<User> convertListDTOToListEntity(List<UserDTO> dtos){
		List<User> users = new ArrayList<User>();
		for (UserDTO dto : dtos) {
			users.add(convertDTOToEntity(dto));
		}
		return users;
	}

}
