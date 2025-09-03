package com.example.demoprice.service.impl;

import com.example.demoprice.model.Price;
import com.example.demoprice.repository.PriceRepository;
import com.example.demoprice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public List<Price> findApplicablePrices(LocalDateTime applicationDate, Long idProduct, Long idBrand) {
        return priceRepository.findApplicablePrices(applicationDate, idProduct, idBrand);
    }

    @Override
    public Price create(Price price) {
        return priceRepository.save(price);
    }
}
