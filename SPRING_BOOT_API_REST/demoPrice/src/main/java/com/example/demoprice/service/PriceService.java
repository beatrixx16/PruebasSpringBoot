package com.example.demoprice.service;

import com.example.demoprice.model.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {

    List<Price> findApplicablePrices(LocalDateTime applicationDate, Long idProduct, Long idBrand);
    Price create(Price price);



}
