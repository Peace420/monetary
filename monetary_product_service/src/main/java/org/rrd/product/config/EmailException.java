package org.rrd.product.config;


public class EmailException extends Exception  {
    //异常信息
    private String message;

    /**
     * @author hujie
     * @param message
     */
    //构造函数
    public EmailException(String message){
        super(message);
        this.message = message;
    }
}
