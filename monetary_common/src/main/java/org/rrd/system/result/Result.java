package org.rrd.system.result;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * Description: Result
 * date: 2020/5/21 15:20
 * author: 朱忠涛
 * version: 1.0
 */

public class Result implements Serializable{

    private int code;
    private String message;
    private Object data;

    public static Result success(Object data){
        return new Result(Code.SUCCESS,data);
    }

    public static Result error(){
        return new Result(Code.ERROR);
    }

    public Result() {
    }

    public Result(Code code) {
        this.code = code.getNumber();
        this.message = code.getMessage();
    }

    public Result(Code code,Object data) {
        this.code = code.getNumber();
        this.message = code.getMessage();
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
