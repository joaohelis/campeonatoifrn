package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Jogador extends Model{
	
	public String nome;	
			
	public Jogador() {}
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	@ManyToOne
	@JoinColumn(name="time_id")
	public Time time;
}
