package org.rrd.system.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luyubo on 2020/5/21.
 */
public class Rate implements Serializable {
    private String id;
    private Date rateDate;
    private double percentage;

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

    public Rate(String id, Date rateDate, double percentage) {
        this.id = id;
        this.rateDate = rateDate;
        this.percentage = percentage;
    }

    public Rate() {
    }
}
