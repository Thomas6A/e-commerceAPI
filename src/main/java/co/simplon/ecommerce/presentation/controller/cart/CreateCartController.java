package co.simplon.ecommerce.presentation.controller.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.CartDTO;
import co.simplon.ecommerce.business.service.cart.ICartService;

@RestController
@CrossOrigin
public class CreateCartController {
	
	private ICartService service;
	
	@PostMapping("/cart")
	public void createCart(@RequestBody CartDTO dto) {
		service.createCart(dto);
	}
	
	@Autowired
	public void setService(ICartService service) {
		this.service = service;
	}

}
