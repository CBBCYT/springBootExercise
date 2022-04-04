package com.spring.boot.example.springboot.mybatis.dao;

public class User {


      /*`id` varchar(32) NOT NULL  COMMENT '用户ID',
      `nickname` varchar(255) NOT NULL  COMMENT '昵称',
      `phone` varchar(32) NOT NULL  COMMENT '手机号',
      email` varchar(255) NOT NULL  COMMENT '邮箱',
      `password` varchar(32) COMMENT '密码',
      `salt` varchar(32) COMMENT '盐值',
      `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',
      `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
    */

    private String id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String salt;
    private String gmtCreate;
    private String gmtUpdate;

    public User()
    {

    }

    public User(String id, String nickname, String phone, String email, String password, String salt, String gmtCreate, String gmtUpdate) {
        this.id = id;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(String gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", gmtCreate='" + gmtCreate + '\'' +
                ", gmtUpdate='" + gmtUpdate + '\'' +
                '}';
    }
}
