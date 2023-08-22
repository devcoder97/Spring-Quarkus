package com.stackroute.productmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//annotate class with @Entity annotation
@Entity
//annotate class with @Table annotation
@Table(name="products")
public class Product {
    //add data members, constructors and getter setters of Product class as id, name, price, quantity
    //annotate id field with @Id annotation
    @Id
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price=price;
        this.quantity=quantity;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    
}
