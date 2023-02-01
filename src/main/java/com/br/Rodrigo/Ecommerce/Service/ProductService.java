package com.br.Rodrigo.Ecommerce.Service;

import com.br.Rodrigo.Ecommerce.Entity.Category;
import com.br.Rodrigo.Ecommerce.Entity.Product;
import com.br.Rodrigo.Ecommerce.Repository.CategoryRepository;
import com.br.Rodrigo.Ecommerce.Repository.ProductRepository;
import com.br.Rodrigo.Ecommerce.Service.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> product= productRepository.findById(id);
        return product.orElseThrow(()-> new ResourceNotFoundException(id));
    }
}