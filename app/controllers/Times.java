package controllers;

import java.util.List;

import models.Time;
import play.mvc.Controller;

public class Times extends Controller{
		
	public static void listar() {
		List<Time> times = Time.findAll();
		render(times);
	}
	
	public static void detalhes(Long id) {
		Time time = Time.findById(id);
		render(time);
	}

}
