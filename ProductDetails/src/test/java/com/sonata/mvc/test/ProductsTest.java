package com.sonata.mvc.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
//import static org.junit.jupiter.api.Assertions.*;



import java.util.List;
import java.util.Optional;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/*
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
*/
import com.sonata.mvc.controller.ProductController;
import com.sonata.mvc.model.Products;
import com.sonata.mvc.repository.ProductRepository;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductsTest {
	private ProductController subject;
	@Autowired
	//private ProductController pController;
	private ProductRepository prepository;
	private Products p;
	
	@Test
    public void getAllProductsTest(){

         List<Products> products = prepository.findAll();
          Assertions.assertThat(products.size()).isGreaterThan(1);
      }
	
	
	
	@BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        subject = new ProductController();
    }
	
	
	/*

	
	@Test
    public void dbTest1() {
		p.setProdId(10);
		p.setProdName("monitor");
		p.setProdCategory("elec");
		p.setProdPrice(452);
		p.setProdSize(1);
		Assertions.assertThat(prepository.save(p));
    }
	*/
}
	/*
	@Test
	public void getEmployeeTest(){
	       Products prod = prepository.findById((long) 1).get();
	        Assertions.assertThat(prod.getProdId()).isEqualTo((long)1);
	        System.out.println(prod);
	    }
	
	@Test
    public void dbTest3() {
		p.setProdId(10);
		p.setProdName("monitor");
		p.setProdCategory("elec");
		p.setProdPrice(452);
		p.setProdSize(1);
		assertEquals(1,prepository.deleteById((long) 10) );
}}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void addedProduct(){
		prepository.save(product);
	     Products fetchedProduct = prepository.findById(product.getProdId()).get();
	     assertEquals(1, fetchedProduct.getProdId());
	}
	
	@Test
	public void deleteTheProduct() {
	      Products product = new Products(4,"Oats", "Grocery", 999.0,1);
	      prepository.save(product);
	      prepository.deleteById(product.getProdId());
	      Optional optional = prepository.findById(product.getProdId());
	      assertEquals(Optional.empty(), optional);
	}*/
	
	
	/*@Test
	public void testFindProductByName() {
	    Products product = prepository.findById(4);    
	    assertThat(product.getProdId().isEqualTo(4));
	}*/
	
	
	
/*	@Test
	public void updateProductTest() {
		Products p = prepository.findById(1L).get();
		p.setProdCategory("food");
		Products updateEmployee = prepository.save(p);
		Assertions.assertThat(updateEmployee.getProdCategory()).isEqualTo("food");
		
	}*/
	
	/*@Test
	public void productTest() {
		Products p = new Products();
		p.setProdId(1L);
		p.setProdName("laptop");
		p.setProdCategory("elec");
		p.setProdPrice(456);
		p.setProdSize(2);
		
		prepository.save(p);
		System.out.println(prepository.findById(1L).get());
	
	}*/
	
	/*@Test
	public void updateTest() {
		Products p = prepository.findById(1L).get();
		p.setProdPrice(4564);
		prepository.save(p);
		System.out.println(prepository.findById(1L).get());
		System.out.println((prepository.findById(1L).get().getProdPrice()));
		
	}*/
	



