package fr.forum.entities;

public class Utilisateur {
    private Long id;
    private String pseudo;
    private String email;
    private String motDePasse;
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
