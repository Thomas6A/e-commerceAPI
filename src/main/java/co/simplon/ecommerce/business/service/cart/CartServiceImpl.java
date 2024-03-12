package co.simplon.ecommerce.business.service.cart;

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
	public void addProductToCart(ProductDTO product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductToCart(ProductDTO product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllProductToCart() {
		// TODO Auto-generated method stub
		
	}
	
	@Autowired
	public void setRepo(ICartRepository repo) {
		this.repo = repo;
	}
	
}
