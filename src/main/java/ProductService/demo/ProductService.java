package ProductService.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Product.demo.Product;
import ProductDB.demo.Database;


@Service
@Component
public class ProductService {
//List<Product> products=new ArrayList<Product>();
	
    @Autowired
	Database db;
	
//	public void addproducts(Product p) {
//		products.add(p);
//		db.save(p);
//		
//	}

	public List<Product> getAllProducts() {
//		return products;
		return db.findAll();
	}

}
