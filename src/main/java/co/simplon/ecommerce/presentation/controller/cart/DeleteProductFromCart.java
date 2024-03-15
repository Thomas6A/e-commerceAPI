package co.simplon.ecommerce.presentation.controller.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.service.cart.ICartService;

@RestController
@CrossOrigin
public class DeleteProductFromCart {
	
	private ICartService service;
	
	@PutMapping("/cartdeleteproduct")
	public void deleteProductToCart(@RequestBody CartDTO cart) {
		service.deleteProductToCart(cart);
	}
	
	@Autowired
	public void setService(ICartService service) {
		this.service = service;
	}

}
