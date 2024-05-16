package dev.purav.productservice09april.services;

import dev.purav.productservice09april.models.Category;
import dev.purav.productservice09april.models.Product;
import dev.purav.productservice09april.repositories.CategoryRepository;
import dev.purav.productservice09april.repositories.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfproductservice")
public class SelfProductService implements ProductService{
    @Override
    public Product getSingleProdcut(Long id) {
        return null;
    }

    private CategoryRepository categoryRepository;
private ProductRepository productRepository;

public SelfProductService(CategoryRepository categoryRepository, ProductRepository productRepository) {
    this.categoryRepository = categoryRepository;
    this.productRepository = productRepository;
}
    @Override
    public Product createProduct(String title,
                                 String description,
                                 double price,
                                 String category,
                                 String image) {
    Product p = new Product();
    p.setTitle(title);
    p.setDescription(description);
    p.setPrice(price);
    p.setImageURL(image);

    Category categoryFromDatabase = categoryRepository.findByTitle(category);

    if(categoryFromDatabase == null){
        Category category1 = new Category();
        category1.setTitle(category);
       //categoryRepository.save(category1); you dnt need this bcs you have PERSIST
        categoryFromDatabase = category1;

    }
    p.setCategory(categoryFromDatabase); // persist as cascade
        /* productRepository.save(p); */
        Product savedProduct = productRepository.save(p);
    return savedProduct;
    // I need to confirm if category class already exist
    }
    @Override
    public Optional<Product> getSingleProduct(Long productId) {
        return productRepository.findById(productId);
    }
    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

}
