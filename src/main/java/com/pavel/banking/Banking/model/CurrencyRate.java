package com.pavel.banking.Banking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class CurrencyRate {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    Date date;
    String state;
    Double amount;

    public CurrencyRate(Date date, String state, Double amount) {
        this.date = date;
        this.state = state;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
