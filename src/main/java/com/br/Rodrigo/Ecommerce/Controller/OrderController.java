package com.br.Rodrigo.Ecommerce.Controller;

import com.br.Rodrigo.Ecommerce.Entity.Order;
import com.br.Rodrigo.Ecommerce.Service.OrderService;
import com.br.Rodrigo.Ecommerce.Service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orders = orderService.findAll();

        return ResponseEntity.ok().body(orders);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}