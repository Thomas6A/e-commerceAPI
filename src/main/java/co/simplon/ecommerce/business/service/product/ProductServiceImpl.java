package co.simplon.ecommerce.business.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.ecommerce.business.convert.ProductConvert;
import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.service.cart.ICartService;
import co.simplon.ecommerce.persistance.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	private IProductRepository repo;
	private ICartService cart;
	private ProductConvert convert;

	@Override
	public List<ProductDTO> getProducts() {
		return convert.convertListEntityToListDto(repo.findAll());
	}

	@Override
	public ProductDTO getProductById(int id) {
		return convert.convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public void createProduct(ProductDTO product) {
		repo.save(convert.convertDtoToEntity(product));
	}

	@Override
	public void deleteProduct(ProductDTO product) {
		List<CartDTO> carts = cart.getAllCart();
		for (CartDTO cartDTO : carts) {
			cart.deleteAllProductToCart(cartDTO);
		}
		repo.delete(convert.convertDtoToEntity(product));
	}

	@Autowired
	public void setRepo(IProductRepository repo) {
		this.repo = repo;
	}

	@Autowired
	public void setConvert(ProductConvert convert) {
		this.convert = convert;
	}

	@Autowired
	public void setCart(ICartService cart) {
		this.cart = cart;
	}
	
	
	
	

}
