package com.stackroute.productmanagement.repository;

//create ProductRepository interface which extends JpaRepository
import com.stackroute.productmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}

