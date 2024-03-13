package co.simplon.ecommerce.business.dto;

import java.util.List;

public class CartDTO {
	
	private int id;
	
	private UserDTO user;
	
	private List<ProductDTO> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
	
	

}
