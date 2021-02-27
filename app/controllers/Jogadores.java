package controllers;

import java.util.List;

import models.Jogador;
import models.Time;
import play.mvc.Controller;

public class Jogadores extends Controller{
	
	public static void form() {
		List<Time> times = Time.findAll(); // busca todos os registros da entidade
		// Time no Banco de Dados
		render(times);
	}
	
	public static void salvar(Jogador jogador) {					
		jogador.save();		
		listar();
	}
	
	public static void editar(Long id) {
		Jogador jogador = Jogador.findById(id);
		List<Time> times = Time.findAll();
		renderTemplate("Jogadores/form.html", jogador, times);
	}
	
	public static void listar() {
		List<Jogador> jogadores = Jogador.findAll();
		render(jogadores);
	}
	
	public static void remover(Long id) {
		Jogador jogador = Jogador.findById(id);
		jogador.delete();
		listar();
	}

}
