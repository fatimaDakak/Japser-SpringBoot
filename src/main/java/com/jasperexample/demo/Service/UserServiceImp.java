package com.jasperexample.demo.Service;

import com.jasperexample.demo.Repository.UserRepository;
import com.jasperexample.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService  {
    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User u) {
     userRepository.save(u);
    }

    @Override
    public void deleteUser(User u) {
        boolean idExist= userRepository.existsById(u.getId());
        if(idExist){
            userRepository.deleteById(u.getId());
        }

    }
}
