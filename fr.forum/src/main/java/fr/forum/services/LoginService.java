package fr.forum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.forum.config.UtilisateurPrincipal;
import fr.forum.dao.IUtilisateurJpaRepository;
import fr.forum.entities.Utilisateur;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private IUtilisateurJpaRepository utilisateurRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Utilisateur utilisateur = utilisateurRepo.findByEmail(username);
	if (null == utilisateur) {
	    throw new UsernameNotFoundException("No user found with username: " + username);
	}
	return new UtilisateurPrincipal(utilisateur);
    }
}
