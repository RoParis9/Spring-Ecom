package com.br.Rodrigo.Ecommerce.Repository;

import com.br.Rodrigo.Ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}