package co.simplon.ecommerce.business.service.cart;

import java.util.List;

import co.simplon.ecommerce.business.dto.CartDTO;

public interface ICartService {
	
	public void createCart(CartDTO cart);
	
	public CartDTO getCartByUser(int user);
	
	public void addProductToCart(CartDTO cart);
	
	public void deleteProductToCart(CartDTO cart);
	
	public void deleteAllProductToCart(CartDTO cart);
	
	public List<CartDTO> getAllCart();

}
