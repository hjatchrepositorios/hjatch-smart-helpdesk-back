/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.User;
import Helpdesk.Smart.Entidades.UserStatus;
import Helpdesk.Smart.Repositories.UserRepository;
import Helpdesk.Smart.Services.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        user.setStatus(UserStatus.ACTIVE);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User update(String id, User user) {
        Optional<User> existing = userRepository.findById(id);
        if (existing.isPresent()) {
            user.setId(id);
            return userRepository.save(user);
        } else {
            throw new ResourceNotFoundException("Not found with id: " + id);
        }
    }

    @Override
    public void delete(String id) {
        Optional<User> existing = userRepository.findById(id);
        if (existing.isPresent()) {
            User user=existing.get();
            user.setStatus(UserStatus.INACTIVE);
            userRepository.save(user);
        } else {
            throw new ResourceNotFoundException("Not found with id: " + id);
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
    @Override
    public Optional<User> getUserByIdKeycloak(String idKeycloak) {
        return userRepository.findByIdKeycloak(idKeycloak);
    }

    @Override
    public List<User> getUsersByStatus(UserStatus us) {
        return userRepository.findUserByStatus(us);
    }

}
