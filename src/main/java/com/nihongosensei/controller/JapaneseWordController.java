package com.nihongosensei.controller;

import com.nihongosensei.entities.JapaneseWord;
import com.nihongosensei.services.JapaneseWordService;
import com.nihongosensei.utils.JapaneseWordUtil;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("japaneseword")

public class JapaneseWordController {
    @Autowired
    JapaneseWordService japaneseWordService;

    @GetMapping("")
    public List<JapaneseWord> findAll() {
        return japaneseWordService.findAll();
    }

    @PostMapping("")
    public JapaneseWord save(@RequestBody JapaneseWord japaneseWord) {
        return japaneseWordService.save(japaneseWord);
    }

    @PostMapping("check")
    public boolean verifie(@RequestBody JapaneseWord japaneseWord) {
        JapaneseWord japaneseWordGet = japaneseWordService.get(japaneseWord.getId());
        if(japaneseWordGet==null){

            return false;
        }
        japaneseWordGet.incrementTries();
        if(JapaneseWordUtil.verifieSiMemeMot(japaneseWordGet,japaneseWord)){
            japaneseWordGet.incrementRightTries();
        }
        else {
            japaneseWordGet.incrementWrongTries();

        }
        japaneseWordGet.revalueMark();
        japaneseWordService.save(japaneseWordGet);

        return JapaneseWordUtil.verifieSiMemeMot(japaneseWordGet,japaneseWord);
    }

    @GetMapping("find")
    public ResponseEntity<JapaneseWord> getById(@PathParam("id") Integer id) {
        JapaneseWord japaneseWord = japaneseWordService.get(id);
        if (japaneseWordService.get(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else return new ResponseEntity<>(japaneseWord, HttpStatus.OK);
    }

    @GetMapping("nottried")
    public List<JapaneseWord> japaneseWordsNotTried(){
        return japaneseWordService.japaneseWordNotTried();
    }

    @GetMapping("badmark")
    public List<JapaneseWord> japaneseWordsWithBadMark(){
        return japaneseWordService.japaneseWithBadMark();
    }
    @GetMapping("mediummark")
    public List<JapaneseWord> japaneseWordWithMediumMark(){
        return japaneseWordService.japaneseWordWithMediumMark();
    }

    @GetMapping("goodmark")
    public List<JapaneseWord> japaneseWordWithGoodMark(){
        return japaneseWordService.japaneseWordWithGoodMark();
    }

}
