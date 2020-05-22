package org.rrd.system.pojo;

import java.util.Date;

public class Rate {
    private String id;
    private Date rate_date;
    private Double percentage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRate_date() {
        return rate_date;
    }

    public void setRate_date(Date rate_date) {
        this.rate_date = rate_date;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
