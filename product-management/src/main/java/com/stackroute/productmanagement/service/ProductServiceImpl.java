package com.stackroute.productmanagement.service;

import com.stackroute.productmanagement.model.Product;
import com.stackroute.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//annotate class with @Service annotation
@Service
public class ProductServiceImpl implements ProductService{
    //autowire ProductRepository
    @Autowired
    private ProductRepository productRepository;

    //create constructor and inject ProductRepository
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //override all the methods from ProductService interface
    //implement saveProduct method which takes in a Product object as parameter and return the Product object
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    //implement getAllProducts method which returns List<Product>
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //implement getProductById method which takes in an int id as parameter and return the Product object
    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

    //implement deleteProductById method which takes in an int id as parameter and return boolean
    @Override
    public boolean deleteProductById(int id) {
        productRepository.deleteById(id);
        return true;
    }

    //implement updateProduct method which takes in an int id and Product object as parameter and return the Product object
    @Override
    public Product updateProduct(int id, Product product) {
        Product product1 = productRepository.findById(id).get();
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        product1.setQuantity(product.getQuantity());
        return productRepository.save(product1);
    }
}
