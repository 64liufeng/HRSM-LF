package com.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class IdCard implements Serializable {
    private int cardNo;
    private String cardAddress;
    private Users users;

    public IdCard() {
    }

    public IdCard(int cardNo, String cardAddress, Users users) {
        this.cardNo = cardNo;
        this.cardAddress = cardAddress;
        this.users = users;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(String cardAddress) {
        this.cardAddress = cardAddress;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "cardNo=" + cardNo +
                ", cardAddress='" + cardAddress + '\'' +
                '}';
    }
}
