package info.kunalgohrani.chucknorrisjokegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import info.kunalgohrani.chucknorrisjokegenerator.services.JokeGenerator;

@Controller
public class JokeController {

    @Autowired
    private final JokeGenerator jokeGenerator;

    JokeController(JokeGenerator jokeGenerator){
        this.jokeGenerator = jokeGenerator;
    }

    @RequestMapping("/")
    public String sendJoke(Model model){
        String joke = jokeGenerator.getJoke();
        model.addAttribute("joke",joke);
        return "index";
    }
    
}
