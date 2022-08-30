package com.ecommerce.service;

import com.ecommerce.model.Role;
import com.ecommerce.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUsers();

    void deleteUser(Long id);

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User findUserById(Long id);

    void changeRole(Role newRole, Long userId);
}
