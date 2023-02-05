package com.nihongosensei.services;

import com.nihongosensei.entities.JapaneseWord;
import com.nihongosensei.repositories.JapaneseWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JapaneseWordService {
    @Autowired
    JapaneseWordRepository japaneseWordRepository;

    public List<JapaneseWord> findAll() {
        return japaneseWordRepository.findAll();
    }

    public JapaneseWord get(Integer id) {
        if (japaneseWordRepository.findById(id).isPresent()){
            return japaneseWordRepository.findById(id).get();
        }
        else return null;

    }

    public JapaneseWord save(JapaneseWord japaneseWord) {
        return japaneseWordRepository.save(japaneseWord);
    }

    public List<JapaneseWord> japaneseWordNotTried(){
        return japaneseWordRepository.japaneseWordNotTried();
    }

    public List<JapaneseWord> japaneseWithBadMark(){
        return japaneseWordRepository.japaneseWithBadMark();
    }

    public List<JapaneseWord> japaneseWordWithMediumMark(){
        return japaneseWordRepository.japaneseWordWithMediumMark();
    }
    public List<JapaneseWord> japaneseWordWithGoodMark(){
        return japaneseWordRepository.japaneseWordWithGoodMark();
    }



}
