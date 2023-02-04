package com.nihongosensei.controller;

import com.nihongosensei.entities.FrenchWord;
import com.nihongosensei.services.FrenchWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("frenchword")
public class FrenchWordController {
    @Autowired
    FrenchWordService frenchWordService;
    @GetMapping("")
    public List<FrenchWord> findAll(){
        return frenchWordService.findAll();
    }
}
