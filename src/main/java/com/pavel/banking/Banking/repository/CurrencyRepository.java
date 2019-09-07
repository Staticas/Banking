package com.pavel.banking.Banking.repository;

import java.util.List;

import com.pavel.banking.Banking.model.Currency;
import com.pavel.banking.Banking.model.CurrencyRate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends CrudRepository<CurrencyRate, Long> {

    List<CurrencyRate> findByState(String state);

    @Query(value = "SELECT * FROM Currency", nativeQuery = true)
    List<CurrencyRate> selectAll();



}