package com.nihongosensei.controller;

import com.nihongosensei.entities.FrenchWord;
import com.nihongosensei.services.FrenchWordService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("findByWord")
    public List<FrenchWord> findByWord(@PathParam("word") String word){
        return frenchWordService.findByFrenchWord(word);
    }
    @PostMapping("")
    public FrenchWord save(@RequestBody FrenchWord frenchWord){
        return frenchWordService.save(frenchWord);
    }


}
