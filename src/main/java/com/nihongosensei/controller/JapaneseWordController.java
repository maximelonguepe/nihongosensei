package com.nihongosensei.controller;

import com.nihongosensei.entities.JapaneseWord;
import com.nihongosensei.services.JapaneseWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("japaneseword")

public class JapaneseWordController {
    @Autowired
    JapaneseWordService japaneseWordService;

    @GetMapping("")
    public List<JapaneseWord> findAll(){
        return japaneseWordService.findAll();
    }

    @PostMapping("")
    public JapaneseWord save(@RequestBody JapaneseWord japaneseWord){
        return japaneseWordService.save(japaneseWord);
    }
}
