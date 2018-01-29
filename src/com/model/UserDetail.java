package com.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class UserDetail implements Serializable {
    private int id;
    private String phone;
    private String receiver;
    private String address;
    private com.model.User user;

    public UserDetail() {
    }

    public UserDetail(int id, String phone, String receiver, String address, com.model.User user) {
        this.id = id;
        this.phone = phone;
        this.receiver = receiver;
        this.address = address;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.model.User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", receiver='" + receiver + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
