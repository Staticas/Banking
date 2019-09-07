package com.pavel.banking.Banking.repository;

import com.pavel.banking.Banking.model.CurrencyRate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class InMemRepository {

    static List<CurrencyRate> rates = new ArrayList<>();

    // ... or we need this
    public void setRates(List<CurrencyRate> posts){
        this.rates = posts;
    }

    // ... or we need this
    public void init(){
        this.rates = new ArrayList<>();
    }

    public List<CurrencyRate> getAllPosts(){
        return rates;
    }


    public void put(Date date, String state, Double amount){}

    public void addRates(CurrencyRate rate){
        // ... or we need this
        // if (this.posts == null) this.posts = new ArrayList<>();
        rates.add(rate);
    }

    public List<CurrencyRate> getAllRates(Model model) {
       return rates;

    }
}
