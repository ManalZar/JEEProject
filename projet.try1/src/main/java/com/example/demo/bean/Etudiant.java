package com.example.demo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cne;
	private String nom;
	private String prenom;
	private int age;
	/*@OneToMany(mappedBy = "etudiant")
	private List<Inscription> inscriptions;*/

	public Etudiant() {
		super();
	}

	public Etudiant(Long id, String cne, String nom, String prenom, int age, List<Inscription> inscriptions) {
		super();
		this.id = id;
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		//this.inscriptions = inscriptions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public List<Inscription> getInscriptions() {
		return inscriptions;
	}

	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}*/

}
