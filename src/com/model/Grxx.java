package com.model;

import java.io.Serializable;

public class Grxx implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String marriage;
    private String date;
    private String ID_number;
    private String phone;
    private String mail;
    private String address;
    private String newAddress;

    public Grxx() {
    }

    public Grxx(int id, String name, String sex,
                String marriage, String date, String ID_number, String phone,
                String mail, String address, String newAddress) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.marriage = marriage;
        this.date = date;
        this.ID_number = ID_number;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.newAddress = newAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getID_number() {
        return ID_number;
    }

    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    @Override
    public String toString() {
        return "Grxx{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", marriage='" + marriage + '\'' +
                ", date='" + date + '\'' +
                ", ID_number='" + ID_number + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", newAddress='" + newAddress + '\'' +
                '}';
    }
}
