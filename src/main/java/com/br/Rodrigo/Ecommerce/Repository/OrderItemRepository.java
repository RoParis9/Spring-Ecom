package com.br.Rodrigo.Ecommerce.Repository;

import com.br.Rodrigo.Ecommerce.Entity.OrderItem;
import com.br.Rodrigo.Ecommerce.Entity.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}