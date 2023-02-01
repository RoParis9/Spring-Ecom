package com.br.Rodrigo.Ecommerce.Service;

import com.br.Rodrigo.Ecommerce.Entity.User;
import com.br.Rodrigo.Ecommerce.Repository.UserRepository;
import com.br.Rodrigo.Ecommerce.Service.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
         Optional<User> user= userRepository.findById(id);
        return user.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }
    public void delete (Long id){
        userRepository.deleteById(id);
    }
    public User update(Long id, User obj){
        User entity = userRepository.getReferenceById(id);
        updateData(entity,obj);
        return userRepository.save(entity);
    }
    public void updateData(User entity, User obj){
        entity.setEmail(obj.getEmail());
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }
}