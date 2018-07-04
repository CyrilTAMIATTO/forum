package fr.forum.entities;

import java.util.List;

public class Rubrique {
    private Long id;
    private String titre;
    private List<Sujet> listeSujets;

    public Rubrique() {

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

    public List<Sujet> getListeSujets() {
	return listeSujets;
    }

    public void setListeSujets(List<Sujet> listeSujets) {
	this.listeSujets = listeSujets;
    }

    @Override
    public String toString() {
	return "Rubrique [id=" + id + ", titre=" + titre + ", listeSujets=" + listeSujets + "]";
    }

}
