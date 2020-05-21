package org.rrd.system.pojo;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: Product_details
 * date: 2020/5/21 10:05
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class Product_details implements Serializable{

    /*id*/
    private int id;

    /*产品ID*/
    private String productId;

    /*xxx期*/
    private String phase;

    /*当前期*/
    private Date nowDate;

    /*开始计息日期*/
    private Date startDate;

    /*结束计息日期*/
    private Date endDate;

    /*状态*/
    private boolean detailsStatus;
}
