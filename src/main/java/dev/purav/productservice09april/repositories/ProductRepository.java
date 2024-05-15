package dev.purav.productservice09april.repositories;

import dev.purav.productservice09april.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
Product save(Product product);
        }
// here spring will automatically run a query on db for the corresponding methodcall