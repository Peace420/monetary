package org.rrd.system.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luyubo on 2020/5/21.
 */
public class Product_details implements Serializable {
    private int id;
    private String phase;
    private String productId;
    private int detaoilsStatus;
    private Date nowDate;
    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getDetaoilsStatus() {
        return detaoilsStatus;
    }

    public void setDetaoilsStatus(int detaoilsStatus) {
        this.detaoilsStatus = detaoilsStatus;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Product_details(int id, String phase, String productId, int detaoilsStatus, Date nowDate, Date startDate, Date endDate) {
        this.id = id;
        this.phase = phase;
        this.productId = productId;
        this.detaoilsStatus = detaoilsStatus;
        this.nowDate = nowDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Product_details() {
    }
}
