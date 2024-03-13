package co.simplon.ecommerce.business.service.cart;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.dto.UserDTO;

public interface ICartService {
	
	public void createCart(CartDTO cart);
	
	public CartDTO getCartByUser(UserDTO user);
	
	public void addProductToCart(CartDTO cart, ProductDTO product);
	
	public void deleteProductToCart(CartDTO cart, ProductDTO product);
	
	public void deleteAllProductToCart(CartDTO cart);

}
