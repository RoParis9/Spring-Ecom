package com.br.Rodrigo.Ecommerce.Repository;

import com.br.Rodrigo.Ecommerce.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}