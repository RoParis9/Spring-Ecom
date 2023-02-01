package com.br.Rodrigo.Ecommerce.config;

import com.br.Rodrigo.Ecommerce.Entity.User;
import com.br.Rodrigo.Ecommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception{

        User u1 = new User(null,"rodrigo","rodrigoparis@email.com","123321","123123123", null);


    }

}