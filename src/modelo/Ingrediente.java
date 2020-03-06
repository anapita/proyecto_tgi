package modelo;

import java.util.ArrayList;

public class Ingrediente {
	
	private Integer id;
	private String nombre;
	private Double precio;
	
	private ArrayList<Plato> platos;
	
	
	public Ingrediente(String nombre, Double precio) {
		
		this.nombre=nombre;
		this.precio=precio;
		
		this.platos=new ArrayList<>();
		
		
		
	}
	
	

}
