package org.rrd.system.vo;

import org.rrd.system.pojo.Product;
import org.rrd.system.pojo.Rate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by luyubo on 2020/5/22.
 */
public class ProductAndRate implements Serializable {
    private String productId;
    private String serviceDeadline;
    private String rateId;
    private int productStatus;
    private int upperNum;
    private double rete;
    private int borrowBalance;
    private int surplusBalance;
    private int upperBalance;
    private int joinNum;

    private String id;
    private Date rateDate;
    private double percentage;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getServiceDeadline() {
        return serviceDeadline;
    }

    public void setServiceDeadline(String serviceDeadline) {
        this.serviceDeadline = serviceDeadline;
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public int getUpperNum() {
        return upperNum;
    }

    public void setUpperNum(int upperNum) {
        this.upperNum = upperNum;
    }

    public double getRete() {
        return rete;
    }

    public void setRete(double rete) {
        this.rete = rete;
    }

    public int getBorrowBalance() {
        return borrowBalance;
    }

    public void setBorrowBalance(int borrowBalance) {
        this.borrowBalance = borrowBalance;
    }

    public int getSurplusBalance() {
        return surplusBalance;
    }

    public void setSurplusBalance(int surplusBalance) {
        this.surplusBalance = surplusBalance;
    }

    public int getUpperBalance() {
        return upperBalance;
    }

    public void setUpperBalance(int upperBalance) {
        this.upperBalance = upperBalance;
    }

    public int getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(int joinNum) {
        this.joinNum = joinNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRateDate() {
        return rateDate;
    }

    public void setRateDate(Date rateDate) {
        this.rateDate = rateDate;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public ProductAndRate() {
    }

    public ProductAndRate(String productId, String serviceDeadline, String rateId, int productStatus, int upperNum, double rete, int borrowBalance, int surplusBalance, int upperBalance, int joinNum, String id, Date rateDate, double percentage) {
        this.productId = productId;
        this.serviceDeadline = serviceDeadline;
        this.rateId = rateId;
        this.productStatus = productStatus;
        this.upperNum = upperNum;
        this.rete = rete;
        this.borrowBalance = borrowBalance;
        this.surplusBalance = surplusBalance;
        this.upperBalance = upperBalance;
        this.joinNum = joinNum;
        this.id = id;
        this.rateDate = rateDate;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "ProductAndRate{" +
                "productId='" + productId + '\'' +
                ", serviceDeadline='" + serviceDeadline + '\'' +
                ", rateId='" + rateId + '\'' +
                ", productStatus=" + productStatus +
                ", upperNum=" + upperNum +
                ", rete=" + rete +
                ", borrowBalance=" + borrowBalance +
                ", surplusBalance=" + surplusBalance +
                ", upperBalance=" + upperBalance +
                ", joinNum=" + joinNum +
                ", id='" + id + '\'' +
                ", rateDate=" + rateDate +
                ", percentage=" + percentage +
                '}';
    }
}
