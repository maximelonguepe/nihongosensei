package com.nihongosensei.repositories;

import com.nihongosensei.entities.FrenchWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrenchWordRepository extends JpaRepository<FrenchWord,Integer> {
}
