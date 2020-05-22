package org.rrd.system.pojo;

<<<<<<< HEAD
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: Rate
 * date: 2020/5/21 10:19
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class Rate implements Serializable{

    /*id*/
    private int id;

    /*利率时间*/
    private Date rateDate;

    /*利率*/
    private double percentage;
=======
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
>>>>>>> origin/master
}
