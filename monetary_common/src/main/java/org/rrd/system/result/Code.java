package org.rrd.system.result;



import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Description: Code
 * date: 2020/5/21 15:22
 * author: 朱忠涛
 * version: 1.0
 */

public class Code implements Serializable{

    private int number;
    private String message;

    /*
    * 通用成功返回数据
    * */
    public static final Code SUCCESS = new Code(0000,"success");

    public static final Code ERROR = new Code(0001,"error");

    public Code() {
    }

    private Code(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Code getSUCCESS() {
        return SUCCESS;
    }


}
