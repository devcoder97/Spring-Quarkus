package com.stackroute.productmanagement.service;

import com.stackroute.productmanagement.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

//annotate class with @Service annotation
@Service
public interface ProductService {
    //add abstract methods as saveProduct, getAllProducts, getProductById, deleteProductById, updateProduct
    //add abstract method to save product and return Product object
    public Product saveProduct(Product product);
    //add abstract method to get all products and return List<Product>
    public List<Product> getAllProducts();
    //add abstract method to get product by id and return Product object
    public Product getProductById(int id);
    //add abstract method to delete product by id and return boolean
    public boolean deleteProductById(int id);
    //add abstract method to update product by id and return Product object
    public Product updateProduct(int id,Product product);


}
