package co.simplon.ecommerce.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.persistance.entity.Cart;

public class CartConvert {
	
	private static CartConvert instance;
	
	public static CartConvert getInstance() {
		if(instance == null) {
			instance = new CartConvert();
		}
		return instance;
	}
	
	public CartDTO convertEntityToDTO(final Cart cart) {
		CartDTO dto = new CartDTO();
		dto.setId(cart.getId_cart());
		dto.setUser(UserConvert.getInstance().convertEntityToDTO(cart.getUser()));
		dto.setProducts(ProductConvert.getInstance().convertListEntityToListDto(cart.getProducts()));
		return dto;
	}
	
	public List<CartDTO> convertListEntityToListDTO(final List<Cart> carts){
		List<CartDTO> dtos = new ArrayList<CartDTO>();
		for (Cart cart : carts) {
			dtos.add(CartConvert.getInstance().convertEntityToDTO(cart));
		}
		return dtos;
	}
	
	public Cart convertDTOToEntity(final CartDTO dto) {
		Cart cart = new Cart();
		cart.setId_cart(dto.getId());
		cart.setUser(UserConvert.getInstance().convertDTOToEntity(dto.getUser()));
		cart.setProducts(ProductConvert.getInstance().convertListDtoToListEntity(dto.getProducts()));
		return cart;
	}
	
	public List<Cart> convertListDtoToListEntity(final List<CartDTO> dtos){
		List<Cart> carts = new ArrayList<Cart>();
		for (CartDTO dto : dtos) {
			carts.add(CartConvert.getInstance().convertDTOToEntity(dto));
		}
		return carts;
	}
	
	  

}
