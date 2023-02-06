package com.nihongosensei.repositories;

import com.nihongosensei.entities.FrenchWord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FrenchWordRepository extends JpaRepository<FrenchWord,Integer> {
    List<FrenchWord> findFrenchWordByWord(String word);
}
