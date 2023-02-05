package com.nihongosensei.repositories;

import com.nihongosensei.entities.JapaneseWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface JapaneseWordRepository extends JpaRepository<JapaneseWord,Integer> {
    @Query("select j from JapaneseWord j where j.tries<3")
    List<JapaneseWord> japaneseWordNotTried();

    @Query("select j from JapaneseWord j where j.mark<5")
    List<JapaneseWord> japaneseWithBadMark();

    @Query("select j from JapaneseWord j where j.mark>5 and j.mark<8")
    List<JapaneseWord> japaneseWordWithMediumMark();

    @Query("select j from JapaneseWord j where j.mark>8")
    List<JapaneseWord> japaneseWordWithGoodMark();

}
