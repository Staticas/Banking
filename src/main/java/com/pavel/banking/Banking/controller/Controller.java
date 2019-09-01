package com.pavel.banking.Banking.controller;

import javax.annotation.PostConstruct;

import com.pavel.banking.Banking.model.Currency;
import com.pavel.banking.Banking.repository.CurrencyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private CurrencyRepository repository;

//    public DatabaseLoader(CurrencyRepository repository) {
//        this.repository = repository;
//    }

    @PostConstruct
    private void initDatabase() {
        // Create
        repository.save(new Currency("Eur", 2.3));
        repository.save(new Currency("Bucks", 3.2));

        // Update
        Currency firstCurrency = repository.findAll().iterator().next();

        // Read
        Iterable<Currency> all = repository.findAll();
        for (Currency currency : all) {
            log.info("Reading {}", currency);
        }

        // Delete

    }
}
