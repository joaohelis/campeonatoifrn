package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Time extends Model{
	
	public String nome;
	
	@OneToMany(mappedBy="time")
	public List<Jogador> jogadores;
	
	public Time() {}
	
	public Time(String nome) {
		this.nome = nome;
	}	

}
