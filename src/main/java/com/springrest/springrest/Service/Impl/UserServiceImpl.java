package com.springrest.springrest.Service.Impl;

import com.springrest.springrest.Model.Users;
import com.springrest.springrest.Repository.UserRepository;
import com.springrest.springrest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Object getUserByEmailPassword(String email, String password) {
        Users u = userRepository.getByEmail(email);
        if(u.getPassword()==password){
            return u;
        }else{
            return new Users();
        }
    }

    @Override
    public Object addNewUser(Users users) {
        return userRepository.save(users);
    }
}
