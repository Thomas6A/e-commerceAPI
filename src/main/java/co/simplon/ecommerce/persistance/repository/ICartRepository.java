package co.simplon.ecommerce.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.ecommerce.persistance.entity.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer>{

}
