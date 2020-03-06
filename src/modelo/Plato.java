package modelo;

import java.util.ArrayList;

public class Plato {

	private Integer id;
	private String nombre;
	private Double precio;

	private ArrayList<Cuenta> cuentas;
	private ArrayList<Ingrediente> ingredientes;

	public Plato(String nombre, Double precio) {

		this.nombre = nombre;
		this.precio = precio;

		this.cuentas = new ArrayList<>();
		this.ingredientes = new ArrayList<>();

	}

}
