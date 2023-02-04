package com.nihongosensei.entities;

import jakarta.persistence.*;

@Entity
public class FrenchWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;

    @OneToOne
    @JoinColumn(name = "japanese_word_id",referencedColumnName = "id")
    private JapaneseWord japaneseWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public JapaneseWord getJapaneseWord() {
        return japaneseWord;
    }

    public void setJapaneseWord(JapaneseWord japaneseWord) {
        this.japaneseWord = japaneseWord;
    }
}
