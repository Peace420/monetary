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
    private String productId;

    /*x个月服务期限*/
    private String serviceDeadline;

    /*利率ID*/
    private String reateId;

    /*产品状态*/
    private boolean productStatus;

    /*上限人数*/
    private int upperNum;

    /*利率*/
    private double rate;

    /*可出借金额*/
    private int borrowBalance;

    /*剩余金额*/
    private int surplusBalance;

    /*授权出借上限金额*/
    private int upperBalance;

    /*加入人次*/
    private int joinNum;

}
