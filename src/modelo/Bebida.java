package modelo;

import java.util.ArrayList;

public class Bebida {
	
	private Integer id;
	private String nombre;
	private Double precio;
	
	private ArrayList<Cuenta> cuentas;
	
	public Bebida(String nombre, Double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cuentas = new ArrayList<>();
		
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	

	

}
