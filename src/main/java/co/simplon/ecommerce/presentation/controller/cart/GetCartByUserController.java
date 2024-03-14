package co.simplon.ecommerce.presentation.controller.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.service.cart.ICartService;

@RestController
@CrossOrigin
public class GetCartByUserController {
	
	private ICartService service;
	
	@GetMapping("/cart/{user}")
	public CartDTO getCartByUser(@PathVariable int user) {
		return service.getCartByUser(user);
	}
	
	@Autowired
	public void setService(ICartService service) {
		this.service = service;
	}

}
