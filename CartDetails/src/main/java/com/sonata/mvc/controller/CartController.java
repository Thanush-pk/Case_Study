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

import com.sonata.mvc.model.Carts;
import com.sonata.mvc.repository.CartRepository;


@RestController
public class CartController {
	
	Optional<Carts> c1;
	
	@Autowired
	private CartRepository crepository;

	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}
	

	@GetMapping("/carts")
	public List<Carts> getAllCarts(){
		return crepository.findAll();
	}
	
@GetMapping("/carts/{id}")
	public ResponseEntity getCartsById(@PathVariable (value = "id") Long prodId) {
	c1 = crepository.findById(prodId);
	return ResponseEntity.ok().body(c1);
}	

@PostMapping(value = "/carts")
public Carts saveCart(@RequestBody Carts cart) {
	return crepository.save(cart);
}

@PutMapping(value="/carts/{id}")
public ResponseEntity updateCart(@PathVariable(value="id") Long prodId, 
		@Validated @RequestBody Carts cdata) {
	c1 = crepository.findById(prodId);
	Carts c2 = c1.get();
	c2.setProdId(cdata.getProdId());
	c2.setProdQuantity(cdata.getProdQuantity());
	c2.setPaymentMode(cdata.getPaymentMode());
		
	Carts updateCart = crepository.save(c2);
	return ResponseEntity.ok(updateCart);
}

@DeleteMapping(value="carts/{id}")
public ResponseEntity deleteCart(@PathVariable(value="id")Long prodId) {
	crepository.deleteById(prodId);
	return ResponseEntity.noContent().build();
}

}