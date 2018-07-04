package fr.forum.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.forum.entities.Utilisateur;

public interface IUtilisateurJpaRepository extends JpaRepository<Utilisateur, Long> {

    @Query("select u from Utilisateur u where u.email = :email")
    public Utilisateur findByEmail(String email);

    @Query("select u from Utilisateur u where u.motDePasse = :mdp")
    public Utilisateur findByMotDePasse(String mdp);

}
