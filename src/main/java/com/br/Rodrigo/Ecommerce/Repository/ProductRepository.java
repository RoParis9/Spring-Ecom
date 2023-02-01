package com.br.Rodrigo.Ecommerce.Repository;

import com.br.Rodrigo.Ecommerce.Entity.Product;
import com.br.Rodrigo.Ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}