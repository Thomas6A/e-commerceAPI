package co.simplon.ecommerce.business.service.product;

import java.util.List;

import co.simplon.ecommerce.business.dto.ProductDTO;

public interface IProductService {
	
	/**
	 * Service pour lister tout les Products
	 * 
	 * @return lite de tous les Products
	 */
	List<ProductDTO> getProducts();
	
	/**
	 * Service pour récuperer un Product par son id
	 * 
	 * @param id
	 * @return un Product
	 */
	ProductDTO getProductById(final int id);
	
	/**
	 * Service pour creer un Product
	 * 
	 * @param Product
	 */
	void createProduct(final ProductDTO Product);
	
	/**
	 * Service pour supprimer un Product
	 * 
	 * @param Product
	 */
	void deleteProduct(final ProductDTO Product);

}
