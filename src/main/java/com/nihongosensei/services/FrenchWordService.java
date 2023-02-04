package com.nihongosensei.services;

import com.nihongosensei.entities.FrenchWord;
import com.nihongosensei.repositories.FrenchWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrenchWordService {
    @Autowired
    FrenchWordRepository frenchWordRepository;
    public List<FrenchWord> findAll(){
        return frenchWordRepository.findAll();
    }

    public FrenchWord save(FrenchWord frenchWord){
        return frenchWordRepository.save(frenchWord);
    }
}
