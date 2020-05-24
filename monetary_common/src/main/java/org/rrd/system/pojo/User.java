package org.rrd.system.pojo;

import java.io.Serializable;

/**
 * Created by luyubo on 2020/5/21.
 */
public class User implements Serializable {
    private String id;
    private String password;
    private String email;
    private double allMoney;
    private double usableBalance;
    private String idcardPhoto;
    private String bankCard;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public double getUsableBalance() {
        return usableBalance;
    }

    public void setUsableBalance(double usableBalance) {
        this.usableBalance = usableBalance;
    }

    public String getIdcardPhoto() {
        return idcardPhoto;
    }

    public void setIdcardPhoto(String idcardPhoto) {
        this.idcardPhoto = idcardPhoto;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String id, String password, String email, double allMoney, double usableBalance, String idcardPhoto, String bankCard, String address) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.allMoney = allMoney;
        this.usableBalance = usableBalance;
        this.idcardPhoto = idcardPhoto;
        this.bankCard = bankCard;
        this.address = address;
    }

    public User() {
    }
}
