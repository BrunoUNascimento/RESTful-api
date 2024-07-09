package Santander.Bootcamp.Java.Bootcamp.java.repository;

import Santander.Bootcamp.Java.Bootcamp.java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
