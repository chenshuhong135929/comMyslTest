package com.test.mysql.mapper;

import com.test.mysql.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
  @Insert("INSERT INTO user(account, name, position) VALUES(#{account}, #{name}, #{position})")
  @Options(useGeneratedKeys = true,keyProperty = "id")
  int addUser(User user);

  @Select("SELECT * FROM user WHERE id = #{id}")
  User getById(int id);
}
