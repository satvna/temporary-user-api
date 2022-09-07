package com.stereotypes.repository;


import com.stereotypes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// repository class expected to be used by service class to save/retrieve contacts to/from database
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
