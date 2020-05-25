package org.rrd.product.Constonst;


/**
 * @author hujie
 * 人人贷 常量
 */
public enum ComtosmstEnum {
    NUMBER_ONE(0),
    NUMBER_TWO(1),
    NUMBER_THREE(2);

    private int code;

    ComtosmstEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
