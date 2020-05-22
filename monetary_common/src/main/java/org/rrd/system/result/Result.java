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

    private int number;
    private String message;
    private Object date;

    public static Result success(Object date){
        return new Result(Code.SUCCESS,date);
    }

    public static Result error(){
        return new Result(Code.ERROR);
    }

    private Result() {
    }

    private Result(Code code) {
        this.number = code.getNumber();
        this.message = code.getMessage();
    }

    private Result(Code code, Object date) {
        this.number = code.getNumber();
        this.message = code.getMessage();
        this.date = date;
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

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
