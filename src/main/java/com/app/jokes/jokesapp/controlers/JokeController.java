package com.app.jokes.jokesapp.controlers;


import com.app.jokes.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokesService service;

    public JokeController(JokesService service) {
        this.service = service;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", service.getJoke());
        return "index";
    }
}
