package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Carts;

//import com.sonata.mvc.model.Products;
@Repository
public interface CartRepository extends JpaRepository<Carts, Long> {

}
