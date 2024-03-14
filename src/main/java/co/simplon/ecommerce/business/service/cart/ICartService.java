package co.simplon.ecommerce.business.service.cart;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.dto.ProductDTO;

public interface ICartService {
	
	public void createCart(CartDTO cart);
	
	public CartDTO getCartByUser(int user);
	
	public void addProductToCart(CartDTO cart);
	
	public void deleteProductToCart(CartDTO cart, ProductDTO product);
	
	public void deleteAllProductToCart(CartDTO cart);

}
