package dev.purav.productservice09april.services;

import dev.purav.productservice09april.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  //  Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(String title,
                  String description,
                  double price,
                  String category,
                  String imageURL);


    Product getSingleProduct(Long id);

}
