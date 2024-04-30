package dev.purav.productservice09april.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    /*
    post/products/ -->request body
    {id;
    title;
    etc
     */
    @PostMapping("/products")
    public void createProduct(){

    }
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") int id){
         return new Product();
    }
    @GetMapping("/products")
    public void getAllProducts(){

    }
    public void updateProduct(){

    }
}
// every api call at the end of the day is the method called inside the controller