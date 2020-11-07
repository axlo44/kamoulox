package com.axlo.kamoulox.restservice;


import com.axlo.kamoulox.dao.SentenceDAO;
import com.axlo.kamoulox.model.Sentence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class KamouloxController {

    @Autowired
    private SentenceDAO sentenceDAO;

    @GetMapping("api/kamoulox")
    public String getKamouloxSentences() throws IOException {

        Sentence sentence = sentenceDAO.getSentence();
        return sentence.toString();

    }

}
