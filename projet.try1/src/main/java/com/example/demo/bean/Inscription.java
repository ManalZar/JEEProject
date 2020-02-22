package com.example.demo.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@ManyToOne
	private Concours concours;
	@ManyToOne
	private List<Etudiant> etudiants;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;

	public Inscription() {
		super();
	}

	public Inscription(Long id, String reference, Concours concours, List<Etudiant> etudiants, Date dateInscription) {
		super();
		this.id = id;
		this.reference = reference;
		this.concours = concours;
		this.etudiants = etudiants;
		this.dateInscription = dateInscription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Concours getConcours() {
		return concours;
	}

	public void setConcours(Concours concours) {
		this.concours = concours;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

}
