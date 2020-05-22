package org.rrd.system.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: Record
 * date: 2020/5/21 9:51
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class Record implements Serializable{

    /*序号*/
    private int id;

    /*用户id*/
    private String userId;

    /*产品详情ID*/
    private String productDetailsId;

    /*授权出借本金*/
    private double borrowBalance;

    /*授权出借时间*/
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date borrowDate;

    /*出借状态（0：服务中 1：退出中 2：已退出）*/
    private int recordStatus;

}
