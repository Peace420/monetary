package org.rrd.system.pojo;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Description: User
 * date: 2020/5/21 9:41
 * author: 朱忠涛
 * version: 1.0
 */
@Getter
@Setter
@Generated
public class User implements Serializable{

    /*id=手机号*/
    private String id;

    /*password*/
    private String password;

    /*邮箱*/
    private String email;

    /*地址*/
    private String address;

    /*账户余额*/
    private int usableBalance;

    /*p2p资产*/
    private int allMoney;

    /*身份证*/
    private String photo;


}
