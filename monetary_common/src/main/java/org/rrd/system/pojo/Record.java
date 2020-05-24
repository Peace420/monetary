package org.rrd.system.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luyubo on 2020/5/21.
 */
public class Record implements Serializable{
    private int id;
    private String userId;
    private String productDetailsId;
    private double borrowBalance;
    private Date borrowDate;
    private int recordStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductDetailsId() {
        return productDetailsId;
    }

    public void setProductDetailsId(String productDetailsId) {
        this.productDetailsId = productDetailsId;
    }

    public double getBorrowBalance() {
        return borrowBalance;
    }

    public void setBorrowBalance(double borrowBalance) {
        this.borrowBalance = borrowBalance;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Record(int id, String userId, String productDetailsId, double borrowBalance, Date borrowDate, int recordStatus) {
        this.id = id;
        this.userId = userId;
        this.productDetailsId = productDetailsId;
        this.borrowBalance = borrowBalance;
        this.borrowDate = borrowDate;
        this.recordStatus = recordStatus;
    }

    public Record() {
    }
}
