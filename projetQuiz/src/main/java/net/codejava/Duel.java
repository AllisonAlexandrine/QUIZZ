package net.codejava;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "duel")

public class Duel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 

	private Integer id;
	private String questions;
	private String reponse;
	
	@OneToOne
	@JoinColumn( name="id_duel" )
	private Joueurs joueur;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
}
