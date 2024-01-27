package com.example.learninglombook.controller;

import com.example.learninglombook.model.Beer;
import com.example.learninglombook.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
public class BeerController {

    private final BeerService beerService;


    @RequestMapping("/api/v1/beer")
    public List<Beer> getBeerList(){
        log.debug("getting all the beer list in controller");
        return beerService.getBeerList();
    }


    public Beer getBeerById(UUID id){
        log.debug("Get Beer By id in the controller layer");
        return  beerService.getBeerById(id);
    }
}
