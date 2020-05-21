package org.rrd.system.pojo;

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
}
