package info.kunalgohrani.chucknorrisjokegenerator.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeGeneratorImpl implements JokeGenerator {

    private ChuckNorrisQuotes obj;


    JokeGeneratorImpl(){
        this.obj = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return obj.getRandomQuote();
    }
    
}
