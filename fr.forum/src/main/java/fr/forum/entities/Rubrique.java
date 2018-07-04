package fr.forum.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rubrique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany
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
