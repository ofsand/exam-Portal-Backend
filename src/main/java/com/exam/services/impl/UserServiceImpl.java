package com.exam.services.impl;

import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> useRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if(local!=null)
        {
            System.out.println("User is already there !!");
            throw new Exception("User already exist !");
        }else {
        //user create
            for(UserRole ur:useRoles)
            {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(useRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }
}
