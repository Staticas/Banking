package com.pavel.banking.Banking.controller;

import com.pavel.banking.Banking.model.CurrencyRate;
import com.pavel.banking.Banking.repository.InMemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Controler {

    @Autowired
    private InMemRepository crp;

//    @RequestMapping(method = RequestMethod.GET, path="/graph")
//    public @ResponseBody
//    List<CurrencyRate> getAllPosts() {
//        return crp.getAllPosts();
//    }
}
