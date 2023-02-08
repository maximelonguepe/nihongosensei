package com.nihongosensei.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoryName;

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "category")
    private List<JapaneseWord> japaneseWordList;
    public Category(Integer id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public List<JapaneseWord> getJapaneseWordList() {
        return japaneseWordList;
    }

    public void setJapaneseWordList(List<JapaneseWord> japaneseWordList) {
        this.japaneseWordList = japaneseWordList;
    }
}
