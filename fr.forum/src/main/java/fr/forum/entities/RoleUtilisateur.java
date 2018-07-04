package fr.forum.entities;

public enum RoleUtilisateur {
    ROLE_USER, ROLE_ADMIN, ROLE_GUEST;

    public String getName() {
	return name();
    }
}
