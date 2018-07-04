package fr.forum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.forum.dao.IUtilisateurJpaRepository;
import fr.forum.entities.Utilisateur;

@Controller
@RequestMapping("/Utilisateur")
public class UtilisateurController {

    @Autowired
    private IUtilisateurJpaRepository utilisateurJpaRepository;

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

    @PostMapping("/Creation")
    public String creation(@ModelAttribute(value = "utilisateur") Utilisateur utilisateur, Model model) {
	utilisateurJpaRepository.save(utilisateur);
	model.addAttribute("utilisateur", new Utilisateur());
	return "authentification";
    }

}
