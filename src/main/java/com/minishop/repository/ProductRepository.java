package com.minishop.repository;

import com.minishop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByActiveTrueOrderByNameAsc();
    List<Product> findByActiveTrueAndCategoryOrderByNameAsc(String category);
    List<Product> findByActiveTrueAndNameContainingIgnoreCaseOrderByNameAsc(String name);
}
