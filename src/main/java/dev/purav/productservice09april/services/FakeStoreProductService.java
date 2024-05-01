package dev.purav.productservice09april.services;

import dev.purav.productservice09april.models.Category;
import dev.purav.productservice09april.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("fakestore")
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getSingleProduct(int productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, String description, int price, Category category, String imageURL) {
        return null;
    }
}
