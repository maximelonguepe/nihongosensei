package com.nihongosensei.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

    private Float mark = (float) 0;

    private Integer tries = 0;

    private Integer rightTries = 0;
    private Integer wrongTries = 0;


    public void incrementTries() {
        this.tries++;
    }

    public void incrementRightTries() {
        this.rightTries++;
    }

    public void incrementWrongTries() {
        this.wrongTries++;
    }

    public void revalueMark() {
        mark = ((float) rightTries / (float) tries) * (float) 10;
    }
}
