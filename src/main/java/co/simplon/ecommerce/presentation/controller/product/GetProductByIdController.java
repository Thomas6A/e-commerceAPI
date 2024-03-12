package co.simplon.ecommerce.presentation.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.service.product.IProductService;

@RestController
@CrossOrigin
public class GetProductByIdController {

	private IProductService service;

	@GetMapping("/products/{id}")
	public ProductDTO getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@Autowired
	public void setService(IProductService service) {
		this.service = service;
	}

}
