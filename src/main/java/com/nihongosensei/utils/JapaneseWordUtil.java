package com.nihongosensei.utils;

import com.nihongosensei.entities.JapaneseWord;

public class JapaneseWordUtil {
    public static boolean verifieSiMemeMot(JapaneseWord japaneseWord1,JapaneseWord japaneseWord2){
        return japaneseWord1.getWord().equals(japaneseWord2.getWord());
    }
}
