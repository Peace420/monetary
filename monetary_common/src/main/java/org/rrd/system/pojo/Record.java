package org.rrd.system.pojo;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: Record
 * date: 2020/5/21 9:51
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class Record implements Serializable{

    /*序号*/
    private int id;

    /*用户id*/
    private String userId;

    /*产品详情ID*/
    private String productDetailsId;

    /*授权出借本金*/
    private double borrowBalance;

    /*授权出借时间*/
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date borrowDate;

    /*出借状态（0：服务中 1：退出中 2：已退出）*/
    private int recordStatus;
=======
import java.util.Date;

public class Record {
    private int id;
    private String user_id;
    private String product_details_id;
    private Double borrow_balance;
    private Date borrow_date;
    private int record_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProduct_details_id() {
        return product_details_id;
    }

    public void setProduct_details_id(String product_details_id) {
        this.product_details_id = product_details_id;
    }

    public Double getBorrow_balance() {
        return borrow_balance;
    }

    public void setBorrow_balance(Double borrow_balance) {
        this.borrow_balance = borrow_balance;
    }

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public int getRecord_status() {
        return record_status;
    }

    public void setRecord_status(int record_status) {
        this.record_status = record_status;
    }
>>>>>>> origin/master
}
