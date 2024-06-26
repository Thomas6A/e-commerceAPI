package co.simplon.ecommerce.presentation.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.service.product.IProductService;

@RestController
@CrossOrigin
public class CreateProductController {

	private IProductService service;

	@PostMapping("/products")
	public void createProduct(@RequestBody ProductDTO dto) {
		service.createProduct(dto);
	}

	@Autowired
	public void setService(IProductService service) {
		this.service = service;
	}
	
}
