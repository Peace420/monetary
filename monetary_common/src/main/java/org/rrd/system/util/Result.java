package org.rrd.system.util;

import java.io.Serializable;

/**
 * 统一结果集
 * Created by progr on 2020/2/17.
 */
public class Result implements Serializable{

    private boolean flag;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public Result(boolean flag, String msg, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
