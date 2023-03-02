package at.freedo.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public String generateJoke(){
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        return joke.getRandomQuote();
    }
}
