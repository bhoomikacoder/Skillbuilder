package com.skillbuilder.service;

import com.skillbuilder.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}