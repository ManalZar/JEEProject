package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class NoteEtdiantModuleConcours {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Module module;
	@ManyToOne
	private Concours concours;
	private Double note;

	public NoteEtdiantModuleConcours() {
		super();
	}

	public NoteEtdiantModuleConcours(Long id, Etudiant etudiant, Module module, Concours concours) {
		super();
		this.id = id;
		this.etudiant = etudiant;
		this.module = module;
		this.concours = concours;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Concours getConcours() {
		return concours;
	}

	public void setConcours(Concours concours) {
		this.concours = concours;
	}

}
