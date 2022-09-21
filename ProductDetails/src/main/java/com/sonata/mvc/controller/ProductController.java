package com.sonata.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.mvc.model.Products;
import com.sonata.mvc.repository.ProductRepository;


@RestController
public class ProductController {
	
	Optional<Products> p1;
	
	@Autowired
	private ProductRepository prepository;

	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}

	@GetMapping("/products")
	public List<Products> getAllProducts(){
		return prepository.findAll();
	}
	
@GetMapping("/products/{id}")
	public ResponseEntity getProductsById(@PathVariable (value = "id") Long prodId) {
	p1 = prepository.findById(prodId);
	return ResponseEntity.ok().body(p1);
}	

@PostMapping(value = "/products")
public Products saveProduct(@RequestBody Products prod) {
	return prepository.save(prod);
}

@PutMapping(value="/products/{id}")
public ResponseEntity updateEmployee(@PathVariable(value="id") Long prodId, 
		@Validated @RequestBody Products pdata) {
	p1 = prepository.findById(prodId);
	Products p2 = p1.get();
	p2.setProdId(pdata.getProdId());
	p2.setProdName(pdata.getProdName());
	p2.setProdCategory(pdata.getProdCategory());
	p2.setProdPrice(pdata.getProdPrice());
	p2.setProdSize(pdata.getProdSize());
	
	
	Products updateProduct = prepository.save(p2);
	return ResponseEntity.ok(updateProduct);
}

@DeleteMapping(value="products/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long prodId) {
	prepository.deleteById(prodId);
	return ResponseEntity.noContent().build();
}

}