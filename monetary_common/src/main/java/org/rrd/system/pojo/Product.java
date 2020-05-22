package org.rrd.system.pojo;

public class Product {
    private String product_id;
    private String service_deadline;
    private String rate_id;
    private int product_status;
    private int upper_num;
    private Double rate;
    private int borrow_balance;
    private int surplus_balance;
    private int upper_banlance;
    private int join_num;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getService_deadline() {
        return service_deadline;
    }

    public void setService_deadline(String service_deadline) {
        this.service_deadline = service_deadline;
    }

    public String getRate_id() {
        return rate_id;
    }

    public void setRate_id(String rate_id) {
        this.rate_id = rate_id;
    }

    public int getProduct_status() {
        return product_status;
    }

    public void setProduct_status(int product_status) {
        this.product_status = product_status;
    }

    public int getUpper_num() {
        return upper_num;
    }

    public void setUpper_num(int upper_num) {
        this.upper_num = upper_num;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getBorrow_balance() {
        return borrow_balance;
    }

    public void setBorrow_balance(int borrow_balance) {
        this.borrow_balance = borrow_balance;
    }

    public int getSurplus_balance() {
        return surplus_balance;
    }

    public void setSurplus_balance(int surplus_balance) {
        this.surplus_balance = surplus_balance;
    }

    public int getUpper_banlance() {
        return upper_banlance;
    }

    public void setUpper_banlance(int upper_banlance) {
        this.upper_banlance = upper_banlance;
    }

    public int getJoin_num() {
        return join_num;
    }

    public void setJoin_num(int join_num) {
        this.join_num = join_num;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id='" + product_id + '\'' +
                ", service_deadline='" + service_deadline + '\'' +
                ", rate_id='" + rate_id + '\'' +
                ", product_status=" + product_status +
                ", upper_num=" + upper_num +
                ", rate=" + rate +
                ", borrow_balance=" + borrow_balance +
                ", surplus_balance=" + surplus_balance +
                ", upper_banlance=" + upper_banlance +
                ", join_num=" + join_num +
                '}';
    }
}
