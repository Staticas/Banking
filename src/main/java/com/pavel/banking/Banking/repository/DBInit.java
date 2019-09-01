package com.pavel.banking.Banking.repository;

import com.pavel.banking.Banking.model.CurrencyRate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

@Service
public class DBInit implements CommandLineRunner {
    private CurrencyRepository currencyRepository;

    public DBInit (CurrencyRepository currencyRepository){
        this.currencyRepository = currencyRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.currencyRepository.deleteAll();




        CurrencyRate USD = new CurrencyRate((new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998")), "USD", 3.45 );
        CurrencyRate GBP = new CurrencyRate((new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998")), "GBP", 5.36 );

        List<>
        this.currencyRepository.saveAll(rates);
    }
}

//@Service
//public class DbInit implements CommandLineRunner {
//    private UserRepository userRepository;
//
//    public DbInit(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        // Delete all
//        this.userRepository.deleteAll();
//
//        // Crete users
//        User dan = new User("dan","dan123","USER","");
//        User admin = new User("admin","admin123","ADMIN","ACCESS_TEST1,ACCESS_TEST2");
//        User manager = new User("manager","manager123","MANAGER","ACCESS_TEST1");
//
//        List<User> users = Arrays.asList(dan,admin,manager);
//
//        // Save to db
//        this.userRepository.saveAll(users);
//    }
//}