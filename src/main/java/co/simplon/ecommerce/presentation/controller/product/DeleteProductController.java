package co.simplon.ecommerce.presentation.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.business.service.product.IProductService;

@RestController
@CrossOrigin
public class DeleteProductController {

	private IProductService service;

	@DeleteMapping("/products")
	public void deleteProduct(@RequestBody ProductDTO dto) {
		service.deleteProduct(dto);
	}

	@Autowired
	public void setService(IProductService service) {
		this.service = service;
	}

}
