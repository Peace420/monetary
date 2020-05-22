package org.rrd.system.pojo;

public class User {
    private String id;
    private String password;
    private String email;
    private Double all_money;
    private Double usable_balance;
    private String idcard_photo;
    private String bank_card;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAll_money() {
        return all_money;
    }

    public void setAll_money(Double all_money) {
        this.all_money = all_money;
    }

    public Double getUsable_balance() {
        return usable_balance;
    }

    public void setUsable_balance(Double usable_balance) {
        this.usable_balance = usable_balance;
    }

    public String getIdcard_photo() {
        return idcard_photo;
    }

    public void setIdcard_photo(String idcard_photo) {
        this.idcard_photo = idcard_photo;
    }

    public String getBank_card() {
        return bank_card;
    }

    public void setBank_card(String bank_card) {
        this.bank_card = bank_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
