package com.niit.UserAuthenticationService.repository;



import com.niit.UserAuthenticationService.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmailAndPassword(String email, String password);

}
