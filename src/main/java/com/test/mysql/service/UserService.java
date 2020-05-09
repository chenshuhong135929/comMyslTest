package com.test.mysql.service;

import com.test.mysql.Entity.User;

public interface UserService {
  int addUser(User user);

  User getById(int id);
}
