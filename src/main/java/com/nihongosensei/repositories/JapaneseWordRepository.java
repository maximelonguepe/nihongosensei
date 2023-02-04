package com.nihongosensei.repositories;

import com.nihongosensei.entities.JapaneseWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JapaneseWordRepository extends JpaRepository<JapaneseWord,Integer> {
}
