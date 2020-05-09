package com.test.mysql.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.test.mysql.Entity.User;
import com.test.mysql.mapper.UserDao;
import com.test.mysql.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
  @Resource
  private UserDao userDao;

  @Override
  public int addUser(User user) {
    return userDao.addUser(user);
  }


  @DS("slave")
  @Override
  public User getById(int id) {
    return userDao.getById(id);
  }
}
