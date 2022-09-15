package com.jeet.demo.repository;

import com.jeet.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query(value="FROM User user WHERE user.username = :username",nativeQuery = true)
    Users findUser(@Param("username") String username);
}
