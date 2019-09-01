package com.pavel.banking.Banking.repository;

import java.util.List;

import com.pavel.banking.Banking.model.CurrencyRate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<CurrencyRate, Long> {

//    List<Currency> findBySign(String sign);

    @Query(value = "SELECT * FROM Currency", nativeQuery = true)
    List<CurrencyRate> selectAll();

}