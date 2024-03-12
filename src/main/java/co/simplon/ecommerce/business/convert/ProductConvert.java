package co.simplon.ecommerce.business.convert;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import co.simplon.ecommerce.business.dto.ProductDTO;
import co.simplon.ecommerce.persistance.entity.Product;

@Component
public class ProductConvert {

	private static ProductConvert instance;

	private ProductConvert() {
	}

	public static ProductConvert getInstance() {
		if (instance == null) {
			instance = new ProductConvert();
		}
		return instance;
	}

	public Product convertDtoToEntity(final ProductDTO dto) {
		if (dto == null) {
			throw new IllegalArgumentException("ProductDTO ne peut pas être null");
		}

		final Product result = new Product();
		result.setId_product(dto.getId());
		result.setProduct_name(dto.getProduct_name());
		result.setProduct_description(dto.getProduct_description());
		result.setProduct_price(dto.getProduct_price());
		result.setProduct_image(dto.getProduct_image());

		return result;
	}

	public List<Product> convertListDtoToListEntity(final List<ProductDTO> dtos) {
		final List<Product> result = new ArrayList<>();
		for (final ProductDTO dto : dtos) {
			result.add(convertDtoToEntity(dto));
		}
		return result;
	}

	public ProductDTO convertEntityToDto(final Product product) {
		if (product == null) {
			throw new IllegalArgumentException("Product ne peut pas être null");
		}

		final ProductDTO result = new ProductDTO();
		result.setId(product.getId_product());
		result.setProduct_name(product.getProduct_name());
		result.setProduct_description(product.getProduct_description());
		result.setProduct_price(product.getProduct_price());
		result.setProduct_image(product.getProduct_image());

		return result;
	}

	public List<ProductDTO> convertListEntityToListDto(final List<Product> products) {
		final List<ProductDTO> result = new ArrayList<>();
		for (final Product product : products) {
			result.add(convertEntityToDto(product));
		}
		return result;
	}

}
