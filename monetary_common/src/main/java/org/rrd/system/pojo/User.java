package org.rrd.system.pojo;


import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by luyubo on 2020/5/21.
 */
@Data
public class User implements Serializable {

    /*id=手机号*/
    private String id;

    /*password*/
    private String password;

    /*邮箱*/
    private String email;
    private double allMoney;
    private double usableBalance;
    private String idcardPhoto;
    private String bankCard;
    private String address;

    /***************
     /*-非数据库字段*/

    //用户出借本金
    private Integer numberOut;

    //产品详情的ID
    private String productDetailsId;


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

    public Integer getNumberOut() {
        return numberOut;
    }

    public void setNumberOut(Integer numberOut) {
        this.numberOut = numberOut;
    }

    public String getProductDetailsId() {
        return productDetailsId;
    }

    public void setProductDetailsId(String productDetailsId) {
        this.productDetailsId = productDetailsId;
    }
}
