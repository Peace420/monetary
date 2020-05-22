package org.rrd.system.pojo;

<<<<<<< HEAD
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Description: User
 * date: 2020/5/21 9:41
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class User implements Serializable{

    /*id=手机号*/
    private String id;

    /*password*/
    private String password;

    /*邮箱*/
    private String email;

    /*地址*/
    private String address;

    /*账户余额*/
    private int usableBalance;

    /*p2p资产*/
    private int allMoney;

    /*身份证*/
    private String photo;


=======
public class User {
    private String id;
    private String password;
    private String email;
    private Double all_money;
    private Double usable_balance;
    private String idcard_photo;
    private String bank_card;
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

    public Double getAll_money() {
        return all_money;
    }

    public void setAll_money(Double all_money) {
        this.all_money = all_money;
    }

    public Double getUsable_balance() {
        return usable_balance;
    }

    public void setUsable_balance(Double usable_balance) {
        this.usable_balance = usable_balance;
    }

    public String getIdcard_photo() {
        return idcard_photo;
    }

    public void setIdcard_photo(String idcard_photo) {
        this.idcard_photo = idcard_photo;
    }

    public String getBank_card() {
        return bank_card;
    }

    public void setBank_card(String bank_card) {
        this.bank_card = bank_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
>>>>>>> origin/master
}
