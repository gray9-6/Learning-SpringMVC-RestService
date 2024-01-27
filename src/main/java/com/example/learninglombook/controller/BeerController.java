package com.example.learninglombook.controller;

import com.example.learninglombook.model.Beer;
import com.example.learninglombook.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@AllArgsConstructor
@Slf4j
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Get Beer By id in the controller layer");
        return  beerService.getBeerById(id);
    }
}
