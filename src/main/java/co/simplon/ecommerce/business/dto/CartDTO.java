package co.simplon.ecommerce.business.dto;

import java.util.Set;

public class CartDTO {
	
	private int id;
	
	private UserDTO user;
	
	private Set<ProductDTO> products;

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

	public Set<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductDTO> products) {
		this.products = products;
	}
	
	

}
