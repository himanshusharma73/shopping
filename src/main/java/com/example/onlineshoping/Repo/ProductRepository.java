package com.example.onlineshoping.Repo;

import com.example.onlineshoping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
