package com.springrest.springrest.Service;

import com.springrest.springrest.Model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Object getUserByEmailPassword(String email, String password);

    Object addNewUser(Users users);
}
