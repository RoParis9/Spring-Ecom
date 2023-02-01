package com.br.Rodrigo.Ecommerce.Repository;

import com.br.Rodrigo.Ecommerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}