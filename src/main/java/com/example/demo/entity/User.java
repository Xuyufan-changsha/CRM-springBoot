package com.example.demo.entity;

public class User {
    private int userId;
    private String userDate;
    private String userName;
    private String userAddress;
    private String img;
    //省略get() and set()

    public User() {
    }

    public User(int userId, String userDate, String userName, String userAddress, String img) {
        this.userId = userId;
        this.userDate = userDate;
        this.userName = userName;
        this.userAddress = userAddress;
        this.img = img;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userDate='" + userDate + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
