package com.nihongosensei.services;

import com.nihongosensei.entities.JapaneseWord;
import com.nihongosensei.repositories.JapaneseWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JapaneseWordService {
    @Autowired
    JapaneseWordRepository japaneseWordRepository;

    public List<JapaneseWord> findAll() {
        return japaneseWordRepository.findAll();
    }

    public JapaneseWord save(JapaneseWord japaneseWord){
        return japaneseWordRepository.save(japaneseWord);
    }
}
