package co.simplon.ecommerce.business.service.cart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.ecommerce.business.convert.CartConvert;
import co.simplon.ecommerce.business.convert.UserConvert;
import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.dto.UserDTO;
import co.simplon.ecommerce.persistance.repository.ICartRepository;

@Service
public class CartServiceImpl implements ICartService {
	
	private ICartRepository repo;

	@Override
	public void createCart(CartDTO cart) {
		repo.save(CartConvert.getInstance().convertDTOToEntity(cart));
		
	}

	@Override
	public CartDTO getCartByUser(UserDTO user) {
		return CartConvert.getInstance().convertEntityToDTO(repo.findByUser(UserConvert.getInstance().convertDTOToEntity(user)));
	}

	@Override
	public void addProductToCart(CartDTO cart, ProductDTO product) {
		cart.getProducts().add(product);
		createCart(cart);
		
	}

	@Override
	public void deleteProductToCart(CartDTO cart, ProductDTO product) {
		cart.getProducts().remove(product);
		createCart(cart);
		
	}

	@Override
	public void deleteAllProductToCart(CartDTO cart) {
		List<ProductDTO> emptyProducts = new ArrayList<>();
		cart.setProducts(emptyProducts);
		createCart(cart);
		
	}
	
	@Autowired
	public void setRepo(ICartRepository repo) {
		this.repo = repo;
	}
	
}
