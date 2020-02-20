package com.itheima01;

public class Passenger {
    private String name;
    private String id;
    private String balance;

    public Passenger() {
    }


    public Passenger(String name, String id, String balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Passenger(String name, String id) {
        this.name = name;//姓名
        this.id = id;//卡号
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   /* public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }*/
}
