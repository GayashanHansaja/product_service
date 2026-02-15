package org.sliit.repository;

import org.sliit.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
