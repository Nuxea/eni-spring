package com.ecommerce.service;

import com.ecommerce.model.Role;
import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public User saveUser(User user){
        // Encode password
//        if (currentUser.getId() != null) {
//            currentUser = userRepository.getReferenceById(user.getId());
//            currentUser.setPassword(passwordEncoder.encode(user.getPassword()));
//        }
//
//        if (currentUser.getId() == null){
//            currentUser.setRole(Role.USER);
//            currentUser.setCreateTime(LocalDateTime.now());
//            currentUser.setPassword(passwordEncoder.encode(user.getPassword()));
//        }

        if (user.getId() == null) {
            user.setRole(Role.USER);
            user.setCreateTime(LocalDateTime.now());
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsernameContainingIgnoreCase(username);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmailContainingIgnoreCase(email);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    @Transactional // is required when executing on update / delete query
    public void changeRole(Role newRole, Long userId){
        userRepository.updateUserRole(userId, newRole);
    }

}
