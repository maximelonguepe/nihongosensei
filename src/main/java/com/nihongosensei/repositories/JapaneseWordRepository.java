package com.nihongosensei.repositories;

import com.nihongosensei.entities.JapaneseWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JapaneseWordRepository extends JpaRepository<JapaneseWord,Integer> {
    @Query("select j from JapaneseWord j where j.tries<3")
    JapaneseWord japaneseWordNotTried();
}
