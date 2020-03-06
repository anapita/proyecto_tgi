package modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cuenta {

	private Integer id;
	private Double importe;
	private LocalDate fecha;
	private String metodo_pago;
	private boolean pago_recibido;

	private Camarero camarero;
	private ArrayList<Plato> platos;
	private ArrayList<Bebida> bebidas;
	private Mesa mesa;
	


	public Cuenta(Camarero camarero, Mesa mesa) {

		this.fecha = LocalDate.now();
		this.camarero = camarero;
		this.mesa = mesa;

		this.pago_recibido = false;
		this.metodo_pago = "tarjeta";
		this.importe = 0.0;
		this.bebidas = new ArrayList<>();
		this.platos = new ArrayList<>();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		
		return Date.valueOf(fecha);
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public boolean isPago_recibido() {
		return pago_recibido;
	}

	public void setPago_recibido(boolean pago_recibido) {
		this.pago_recibido = pago_recibido;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(ArrayList<Plato> platos) {
		this.platos = platos;
	}

	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
