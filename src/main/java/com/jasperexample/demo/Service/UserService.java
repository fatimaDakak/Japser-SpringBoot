package com.jasperexample.demo.Service;

import com.jasperexample.demo.Repository.UserRepository;
import com.jasperexample.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> findAllUsers();
    public void saveUser(User u);
    public void deleteUser(User u);


}
