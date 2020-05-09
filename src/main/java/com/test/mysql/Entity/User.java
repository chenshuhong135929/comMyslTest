package com.test.mysql.Entity;


import lombok.Data;

@Data
public class User {
  private int id;
  private String account;
  private String name;
  private String position;
}
