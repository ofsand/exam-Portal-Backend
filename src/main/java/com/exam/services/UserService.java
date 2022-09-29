package com.exam.services;

import com.exam.models.User;
import com.exam.models.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> useRoles) throws Exception;

    public User getUser(String username);
}
