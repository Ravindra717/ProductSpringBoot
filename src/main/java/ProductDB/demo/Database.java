package ProductDB.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import Product.demo.Product;
import jakarta.persistence.Id;

public interface Database extends JpaRepository<Product, Integer> {

}
