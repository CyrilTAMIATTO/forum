package fr.forum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.forum.dao.IUtilisateurJpaRepository;
import fr.forum.entities.Utilisateur;

@Controller
@RequestMapping("/Forum")
public class forumControlleur {

    @Autowired
    private IUtilisateurJpaRepository utilisateurJpaRepository;

    @GetMapping("/Accueil")
    public String accueil() {
	return "accueil";
    }

    @GetMapping("/Authentification")
    public String authentification() {
	return "authentification";
    }

    @PostMapping("/Identification")
    public String identification(@ModelAttribute(value = "utilisateur") Utilisateur utilisateur, Model model) {

	Utilisateur uRepoEmail = utilisateurJpaRepository.findByEmail(utilisateur.getEmail());
	Utilisateur uRepoMotDePasse = utilisateurJpaRepository.findByMotDePasse(utilisateur.getMotDePasse());
	if (uRepoEmail != null && uRepoMotDePasse != null) {
	    model.addAttribute("pseudo", utilisateur.getPseudo());
	    model.addAttribute("utilisateur", new Utilisateur());
	    return "accueil";
	} else {
	    return "authentification";
	}
    }

    @GetMapping("/Inscription")
    public String inscription() {
	return "inscription";
    }

    @PostMapping("/Creation")
    public String creation(@ModelAttribute(value = "utilisateur") Utilisateur utilisateur, Model model) {
	utilisateurJpaRepository.save(utilisateur);
	model.addAttribute("utilisateur", new Utilisateur());
	return "authentification";
    }

}
