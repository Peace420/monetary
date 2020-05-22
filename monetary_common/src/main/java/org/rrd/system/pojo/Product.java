package org.rrd.system.pojo;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Description: Product
 * date: 2020/5/21 9:57
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class Product implements Serializable{

    /*产品ID*/
    private String product_id;

    /*x个月服务期限*/
    private String service_deadline;

    /*利率ID*/
    private String reate_id;

    /*产品状态*/
    private boolean product_status;

    /*上限人数*/
    private int upper_num;

    /*利率*/
    private Double rate;

    /*可出借金额*/
    private int borrow_balance;

    /*剩余金额*/
    private int surplus_balance;

    /*授权出借上限金额*/
    private int upper_balance;

    /*加入人次*/
    private int join_num;

    public Product() {
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getService_deadline() {
        return service_deadline;
    }

    public void setService_deadline(String service_deadline) {
        this.service_deadline = service_deadline;
    }

    public String getReate_id() {
        return reate_id;
    }

    public void setReate_id(String reate_id) {
        this.reate_id = reate_id;
    }

    public boolean isProduct_status() {
        return product_status;
    }

    public void setProduct_status(boolean product_status) {
        this.product_status = product_status;
    }

    public int getUpper_num() {
        return upper_num;
    }

    public void setUpper_num(int upper_num) {
        this.upper_num = upper_num;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getBorrow_balance() {
        return borrow_balance;
    }

    public void setBorrow_balance(int borrow_balance) {
        this.borrow_balance = borrow_balance;
    }

    public int getSurplus_balance() {
        return surplus_balance;
    }

    public void setSurplus_balance(int surplus_balance) {
        this.surplus_balance = surplus_balance;
    }

    public int getUpper_balance() {
        return upper_balance;
    }

    public void setUpper_balance(int upper_balance) {
        this.upper_balance = upper_balance;
    }

    public int getJoin_num() {
        return join_num;
    }

    public void setJoin_num(int join_num) {
        this.join_num = join_num;
    }

    public Product(String product_id, String service_deadline, String reate_id, boolean product_status, int upper_num, Double rate, int borrow_balance, int surplus_balance, int upper_balance, int join_num) {
        this.product_id = product_id;
        this.service_deadline = service_deadline;
        this.reate_id = reate_id;
        this.product_status = product_status;
        this.upper_num = upper_num;
        this.rate = rate;
        this.borrow_balance = borrow_balance;
        this.surplus_balance = surplus_balance;
        this.upper_balance = upper_balance;
        this.join_num = join_num;
    }
}