package fr.forum.entities;

import java.util.Date;

public class Commentaire {

    private Long id;
    private Date dateCreation = new Date();
    private Utilisateur utilisateur;
    private String message;

    public Commentaire() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Date getDateCreation() {
	return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
    }

    public Utilisateur getUtilisateur() {
	return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    @Override
    public String toString() {
	return "Commentaire [id=" + id + ", dateCreation=" + dateCreation + ", utilisateur=" + utilisateur
		+ ", message=" + message + "]";
    }

}
