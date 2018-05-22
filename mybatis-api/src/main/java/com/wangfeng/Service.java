package com.wangfeng;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import wangfeng.mapper.UserMapper;
import wangfeng.model.User;

@org.springframework.stereotype.Service
public class Service {

  @Autowired
  private UserMapper userMapper;

  public void print() {
    List<User> users = userMapper.selectAll();
    for (User user : users) {
      System.out.println(user.getUserName());

    }
  }

}
