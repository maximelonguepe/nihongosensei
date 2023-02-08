package com.nihongosensei.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FrenchWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String word;

    @OneToOne
    @JoinColumn(name = "japanese_word_id",referencedColumnName = "id")
    private JapaneseWord japaneseWord;


}
