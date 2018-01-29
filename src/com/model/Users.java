package com.model;

import com.model.IdCard;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class Users implements Serializable{
    private int id;
    private String name;
    private String pass;
    private IdCard idCard;

    public Users() {
    }

    public Users(int id, String name, String pass, IdCard idCard) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.idCard = idCard;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", idCard=" + idCard +
                '}';
    }
}
