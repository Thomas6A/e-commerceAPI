package co.simplon.ecommerce.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.ecommerce.persistance.entity.Cart;
import co.simplon.ecommerce.persistance.entity.User;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer>{
	
	@Query("select c from cart c where user =: user")
	Cart findByUser(User user);

}
