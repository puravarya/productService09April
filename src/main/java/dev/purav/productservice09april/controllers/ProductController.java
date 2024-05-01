package dev.purav.productservice09april.controllers;

import dev.purav.productservice09april.models.Product;
import dev.purav.productservice09april.services.FakeStoreProductService;
import dev.purav.productservice09april.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
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
    ProductService productService;
    public ProductController(@Qualifier("fakestore")ProductService productService) {
        this.productService = productService;
        //qualifier is used to inject the dependency to be injected here
    }
    //ProductService productService = new FakeStoreProductService();
    @PostMapping("/products")
    public void createProduct(){

    }
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") int id){
         return productService.getSingleProduct(id);
    }
    @GetMapping("/products")
    public void getAllProducts(){

    }
    public void updateProduct(){

    }
}
// every api call at the end of the day is the method called inside the controller