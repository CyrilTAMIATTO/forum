package fr.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Forum")
public class ForumController {

    @GetMapping("/Accueil")
    public String accueil() {
	return "accueil";
    }

    @GetMapping("/Authentification")
    public String authentification() {
	return "authentification";
    }

    @GetMapping("/Inscription")
    public String inscription() {
	return "inscription";
    }

    @GetMapping("/Rubrique")
    public String rubrique() {
	return "rubrique";
    }

    @GetMapping("/Sujet")
    public String sujet() {
	return "Sujet";
    }

}
