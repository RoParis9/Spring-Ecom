package com.br.Rodrigo.Ecommerce.Service;

import com.br.Rodrigo.Ecommerce.Entity.Order;
import com.br.Rodrigo.Ecommerce.Repository.OrderRepository;
import com.br.Rodrigo.Ecommerce.Service.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.orElseThrow(()-> new ResourceNotFoundException(id));
    }
}