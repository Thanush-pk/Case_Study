package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.mvc.model.Products;
import com.sonata.mvc.repository.ProductRepository;

@SpringBootTest
class ProductDetailsApplicationTests {

	@Autowired
	private ProductRepository prepository;
	
	@Test
	public void updateProductTest() {
		Products p = prepository.findById(1L).get();
		p.setProdCategory("food");
		Products updateEmployees = prepository.save(p);
		Assertions.assertThat(updateEmployees.getProdCategory()).isEqualTo("food");
		
	}
}
