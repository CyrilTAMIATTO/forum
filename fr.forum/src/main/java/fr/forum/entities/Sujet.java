package fr.forum.entities;

import java.util.List;

public class Sujet {

    private Long id;
    private String titre;
    private List<Commentaire> listeCommentaires;
    private Utilisateur utilisateur;

    public Sujet() {

    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getTitre() {
	return titre;
    }

    public void setTitre(String titre) {
	this.titre = titre;
    }

    public List<Commentaire> getListeCommentaires() {
	return listeCommentaires;
    }

    public void setListeCommentaires(List<Commentaire> listeCommentaires) {
	this.listeCommentaires = listeCommentaires;
    }

    public Utilisateur getUtilisateur() {
	return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
	return "Sujet [id=" + id + ", titre=" + titre + ", listeCommentaires=" + listeCommentaires + ", utilisateur="
		+ utilisateur + "]";
    }

}
