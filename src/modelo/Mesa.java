package modelo;

import java.util.ArrayList;

public class Mesa {

	private Integer id;
	private Integer num_personas;

	private ArrayList<Cuenta> cuentas;

	public Mesa(Integer num_personas) {

		this.num_personas = num_personas;

		this.cuentas = new ArrayList<>();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum_personas() {
		return num_personas;
	}

	public void setNum_personas(Integer num_personas) {
		this.num_personas = num_personas;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

}
