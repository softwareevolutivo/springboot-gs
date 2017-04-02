package ec.com.softwareevolutivo.demos.springbootgs.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.softwareevolutivo.demos.springbootgs.domain.dto.Product;


@RestController
@RequestMapping("/api")
public class ProductRest {

	  @GetMapping("/products")
	  public List<Product> getAllProducts() {
	    
		  List<Product> productList = new ArrayList<Product>();
		  
		  Product product1 = new Product();
		  product1.setId(1L);
		  product1.setName("Product 1");
		  product1.setPrice(22.99);
		  productList.add(product1);
		  
		  Product product2 = new Product();
		  product2.setId(2L);
		  product2.setName("Product 2");
		  product2.setPrice(3.49);
		  productList.add(product1);
		  
		  return productList;
		  
		  
	  }

	
}
