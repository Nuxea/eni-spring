package com.ecommerce.repository;

import com.ecommerce.model.Role;
import com.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
//    findBy + fieldName
    Optional<User> findByUsernameContainingIgnoreCase(String username);

    @Modifying
    @Query("update User set role = :role where id = :userId")
    void updateUserRole(@Param("userId") Long userId, @Param("role") Role role);

    Optional<User> findByEmailContainingIgnoreCase(String email);

    User findUserById(Long id);
}
