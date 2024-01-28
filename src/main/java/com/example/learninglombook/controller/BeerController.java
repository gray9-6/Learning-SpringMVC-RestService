package com.example.learninglombook.controller;

import com.example.learninglombook.model.Beer;
import com.example.learninglombook.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {


    private final BeerService beerService;


    @PostMapping("/addBeer")
//    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addBeer(@RequestBody Beer beer){
        Beer savedBeer = beerService.addBeer(beer);
        return new ResponseEntity<>("created",HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> getBeerList(){
        log.debug("getting all the beer list in controller");
        return beerService.getBeerList();
    }


    @RequestMapping(value = "/getBeerById/{beerId}",method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable UUID beerId){
        log.debug("Get Beer By id in the controller layer");
        return  beerService.getBeerById(beerId);
    }
}
