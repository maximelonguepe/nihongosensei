package com.nihongosensei.entities;

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

    private  Float mark = (float) 0;

    private Integer tries =0;

    private Integer rightTries =0;
    private Integer wrongTries =0;

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

    public Float getMark() {
        return mark;
    }

    public void setMark(Float note) {
        this.mark = note;
    }

    public Integer getTries() {
        return tries;
    }

    public void setTries(Integer nombreEssais) {
        this.tries = nombreEssais;
    }


    public Integer getRightTries() {
        return rightTries;
    }

    public void setRightTries(Integer nombreEssaisCorrects) {
        this.rightTries = nombreEssaisCorrects;
    }

    public Integer getWrongTries() {
        return wrongTries;
    }

    public void setWrongTries(Integer nombreEssaisInCorrects) {
        this.wrongTries = nombreEssaisInCorrects;
    }

    public void incrementTries(){
        this.tries++;
    }

    public void incrementRightTries(){
        this.rightTries++;
    }

    public void incrementWrongTries(){
        this.wrongTries++;
    }

    public void revalueMark(){
        mark=((float)rightTries/(float) tries)*(float) 10;
    }
}
