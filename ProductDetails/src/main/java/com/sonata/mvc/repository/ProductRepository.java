package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Products;

@Repository
//@ComponentScan({"com.sonata.controller"})

public interface ProductRepository extends JpaRepository<Products, Long> {

}
