package com.example.learninglombook.service.impl;

import com.example.learninglombook.model.Beer;
import com.example.learninglombook.model.BeerStyle;
import com.example.learninglombook.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@Service
@Slf4j
public class BeerServiceImplementation implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer id in the service layer - " +id.toString() );

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Tuborg")
                .beerStyle(BeerStyle.LARGER)
                .upc("12345")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }
}
