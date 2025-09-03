package com.example.demoprice.controller;

import com.example.demoprice.model.Price;
import com.example.demoprice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping("/{applicationDate}/{idProduct}/{idBrand}")
    private ResponseEntity<?> listApplicablePrices(@PathVariable LocalDateTime applicationDate,@PathVariable Long idProduct,@PathVariable Long idBrand){
        List<Price> prices = priceService.findApplicablePrices(applicationDate, idProduct, idBrand);
        return ResponseEntity.ok(prices);

    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Price price){
        Price createdPrice = priceService.create(price);
        return ResponseEntity.ok(createdPrice);
    }


}
