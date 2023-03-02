package at.freedo.jokeapp.controllers;

import at.freedo.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenerateJokeController {

    private final JokeService jokeService;

    public GenerateJokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.generateJoke());
        return "index";
    }
}
