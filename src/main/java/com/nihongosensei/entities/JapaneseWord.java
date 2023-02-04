package com.nihongosensei.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class JapaneseWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;

    @JsonIgnoreProperties("japaneseWord")
    @OneToOne(mappedBy = "japaneseWord")
    FrenchWord frenchWord;

    @ManyToOne
    private Category category;

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

    public FrenchWord getFrenchWord() {
        return frenchWord;
    }

    public void setFrenchWord(FrenchWord frenchWord) {
        this.frenchWord = frenchWord;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
