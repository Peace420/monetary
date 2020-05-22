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
    private String productid;

    /*x个月服务期限*/
    private String servicedeadline;

    /*利率ID*/
    private String reateid;

    /*产品状态*/
    private boolean productstatus;

    /*上限人数*/
    private int uppernum;

    /*利率*/
    private double rate;

    /*可出借金额*/
    private int borrowbalance;

    /*剩余金额*/
    private int surplusbalance;

    /*授权出借上限金额*/
    private int upperbalance;

    /*加入人次*/
    private int joinnum;

    public Product() {
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getServicedeadline() {
        return servicedeadline;
    }

    public void setServicedeadline(String servicedeadline) {
        this.servicedeadline = servicedeadline;
    }

    public String getReateid() {
        return reateid;
    }

    public void setReateid(String reateid) {
        this.reateid = reateid;
    }

    public boolean isProductstatus() {
        return productstatus;
    }

    public void setProductstatus(boolean productstatus) {
        this.productstatus = productstatus;
    }

    public int getUppernum() {
        return uppernum;
    }

    public void setUppernum(int uppernum) {
        this.uppernum = uppernum;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getBorrowbalance() {
        return borrowbalance;
    }

    public void setBorrowbalance(int borrowbalance) {
        this.borrowbalance = borrowbalance;
    }

    public int getSurplusbalance() {
        return surplusbalance;
    }

    public void setSurplusbalance(int surplusbalance) {
        this.surplusbalance = surplusbalance;
    }

    public int getUpperbalance() {
        return upperbalance;
    }

    public void setUpperbalance(int upperbalance) {
        this.upperbalance = upperbalance;
    }

    public int getJoinnum() {
        return joinnum;
    }

    public void setJoinnum(int joinnum) {
        this.joinnum = joinnum;
    }

    public Product(String productid, String servicedeadline, String reateid, boolean productstatus, int uppernum, double rate, int borrowbalance, int surplusbalance, int upperbalance, int joinnum) {
        this.productid = productid;
        this.servicedeadline = servicedeadline;
        this.reateid = reateid;
        this.productstatus = productstatus;
        this.uppernum = uppernum;
        this.rate = rate;
        this.borrowbalance = borrowbalance;
        this.surplusbalance = surplusbalance;
        this.upperbalance = upperbalance;
        this.joinnum = joinnum;
    }
}