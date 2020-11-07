package com.axlo.kamoulox.dao;

import com.axlo.kamoulox.model.Sentence;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

@Repository
public class SentenceDAOImpl implements SentenceDAO {

    public static List<String> lstVerbes;
    public static List<String> lstActions;

    @Override
    public Sentence getSentence() {

        Sentence sent = new Sentence(this.getRandomElement(lstVerbes),this.getRandomElement(lstActions));
        return sent;
    }

    public SentenceDAOImpl() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File verbeFile = new File(classLoader.getResource("verbes.txt").getFile());
        File actionFile = new File(classLoader.getResource("actions.txt").getFile());
        //Variabilisation des fichiers
        lstVerbes = Files.readAllLines(verbeFile.toPath());
        lstActions = Files.readAllLines(actionFile.toPath());
    }

    // Function select an element base on index
    // and return an element
    private String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
