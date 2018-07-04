package fr.forum.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCreation = new Date();

    @ManyToOne
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

    @ManyToOne
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
