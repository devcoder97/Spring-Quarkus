package com.stackroute.productmanagement.controller;

import com.stackroute.productmanagement.model.Product;
import com.stackroute.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//annotate class with @RestController and @RequestMapping annotations
//create class ProductController
@RestController
@RequestMapping("/product")
public class ProductController {
    //auto wire ProductService
    @Autowired
    private ProductService productService;
    //create constructor for ProductController with ProductService as parameter
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //create post mapping for saveProduct method with url /api/v1/product which take parameter as Product object and return the response as ResponseEntity
    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        //call saveProduct method from service and return the response as ResponseEntity
        Product product1 = productService.saveProduct(product);
        return ResponseEntity.ok(product1);
    }
    //create get mapping for getAllProducts method with url /api/v1/product and return the response as ResponseEntity
    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
    //create get mapping for getProductById method with url /api/v1/product/{productId} and return the response as ResponseEntity
    @GetMapping("/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable int productId){
        return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
    }
    //create delete mapping for deleteProductById method with url /api/v1/product/{productId} and return the response as ResponseEntity
    @DeleteMapping("/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductById(productId), HttpStatus.OK);
    }
    //create put mapping for updateProduct method with url /api/v1/product/{productId} and return the response as ResponseEntity
    @PutMapping("/{productId}")
    public ResponseEntity<?> updateProduct(@PathVariable int productId, @RequestBody Product product){
        return new ResponseEntity<>(productService.updateProduct(productId, product), HttpStatus.OK);
    }
}
