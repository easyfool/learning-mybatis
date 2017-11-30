package com.wangfeng.model;

public class User {
    private Integer id;

    private String userName;

    private Integer userId;

    public User(Integer id, String userName, Integer userId) {
        this.id = id;
        this.userName = userName;
        this.userId = userId;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}