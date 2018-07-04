package fr.forum.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{error.utilisateur.pseudo.obligatoire}")
    private String pseudo;

    @NotNull(message = "{error.utilisateur.email.obligatoire}")
    private String email;

    @NotNull(message = "{error.utilisateur.motDePasse.obligatoire}")
    private String motDePasse;

    @NotNull(message = "{error.utilisateur.role.obligatoire}")
    @Enumerated(EnumType.STRING)
    private RoleUtilisateur role = RoleUtilisateur.ROLE_USER;

    public Utilisateur() {

    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getMotDePasse() {
	return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
    }

    public RoleUtilisateur getRole() {
	return role;
    }

    public void setRole(RoleUtilisateur role) {
	this.role = role;
    }

    @Override
    public String toString() {
	return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", email=" + email + ", motDePasse=" + motDePasse
		+ ", role=" + role + "]";
    }

}
