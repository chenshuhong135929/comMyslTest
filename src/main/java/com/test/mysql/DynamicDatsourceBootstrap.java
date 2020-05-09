package com.test.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.mysql.mapper")
public class DynamicDatsourceBootstrap {
  public static void main(String[] args) {
    SpringApplication.run(DynamicDatsourceBootstrap.class, args);
  }
}
