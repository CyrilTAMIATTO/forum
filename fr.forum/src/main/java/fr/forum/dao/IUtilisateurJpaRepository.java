package fr.forum.dao;

import fr.forum.entities.Utilisateur;

public interface IUtilisateurJpaRepository {

    // Requete derivee = findBy + attribut de l'entite
    public Utilisateur findByEmail(String email);

}
