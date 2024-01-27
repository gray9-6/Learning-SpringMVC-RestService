package com.example.learninglombook.service;

import com.example.learninglombook.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
