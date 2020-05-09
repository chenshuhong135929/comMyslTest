package com.test.mysql;

import com.test.mysql.Entity.User;
import com.test.mysql.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest{
  @Autowired
  private UserService userService;

  @Test
  public void testAddUser(){
    User user = new User();
    user.setName("李四");
    user.setAccount("sili");
    user.setPosition("JAVA开发工程师");
    int i = userService.addUser(user);
    System.out.println(user);
  }


  @Test
  public void testGetById(){
    int id = 4;
    User user = userService.getById(id);
    Assert.assertEquals("sanzhang",user.getAccount());
  }

}
