package controlador;

import java.sql.*;
import modelo.*;

import java.util.ArrayList;

import modelo.Camarero;

public class SQLInsert {

	public static void insertarCamarero(Camarero camarero) {

		String sCamarero = "INSERT INTO Camareros (Nombre, Apellido, DNI, Sueldo) VALUES (?, ?, ?, ?)";

		try {


			Connection c = SQLConnect.getC();

			PreparedStatement s = c.prepareStatement(sCamarero);
			s.setString(1, camarero.getNombre());
			s.setString(2, camarero.getApellido());
			s.setString(3, camarero.getDni());
			s.setInt(4, camarero.getSueldo());
			s.executeUpdate();

			s.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void insertarMesa(Mesa mesa) {

		String sMesa = "INSERT INTO Mesa (Num_Personas) VALUES (?)";

		try {


			Connection c = SQLConnect.getC();

			PreparedStatement s = c.prepareStatement(sMesa);
			s.setInt(1, mesa.getNum_personas()));

			s.executeUpdate();

			s.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void insertarBebida(Bebida bebida) {

		String sBebida = "INSERT INTO Bebidas (Nombre, Precio) VALUES (?, ?)";

		try {

			SQLConnect sqlconnect = new SQLConnect();

			Connection c = sqlconnect.getC();

			PreparedStatement s = c.prepareStatement(sBebida);

			s.setString(1, bebida.getNombre());
			s.setDouble(2, bebida.getPrecio());
			s.executeUpdate();

			s.close();

			sqlconnect.cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	  public static void insertarCuenta(Cuenta cuenta) {

		String sCuenta = "INSERT INTO Cuentas (id_Camarero, id_Mesa, Fecha, Importe, Metodo_pago, Pago_recibido) VALUES (?, ?, ?, ?. ?, ?)";

		try {

			

			Connection c = SQLConnect.getC();

			PreparedStatement s = c.prepareStatement(sCuenta);

			s.setInt(1, cuenta.getCamarero().getId());
			s.setInt(2, cuenta.getMesa().getId());
			s.setDate(3, cuenta.getFecha()); 
			s.setDouble(4, cuenta.getImporte());
			s.setString(5, cuenta.getMetodo_pago());
			s.setBoolean(6, cuenta.isPago_recibido());
			s.executeUpdate();

			s.close();

			SQLConnect.cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} 
	
	public static void insertarDatosPrueba() {
		
		// Camareros prueba

		Camarero camarero1 = new Camarero("Javier", "Martin", "54298855H", 15000);
		Camarero camarero2 = new Camarero("Carolina", "Begara", "54298857C", 14000);
		Camarero camarero3 = new Camarero("Ana", "Pita", "54298827J", 20000);

		ArrayList<Camarero> camareros_prueba = new ArrayList<>();

		camareros_prueba.add(camarero1);
		camareros_prueba.add(camarero2);
		camareros_prueba.add(camarero3);

		for (Camarero camarero : camareros_prueba) {

			insertarCamarero(camarero);

		}
		
		//Mesas prueba
		Mesa mesa1 = new Mesa (6);
		Mesa mesa2 = new Mesa(8);
		
		ArrayList<Mesa> mesas_prueba = new ArrayList<>();
		
		mesas_prueba.add(mesa1);
		mesas_prueba.add(mesa2);
		
		for(Mesa mesa : mesas_prueba) {
			insertarMesa(mesa);
			
		}
		
		//Cuentas prueba
		Cuenta cuenta1 = new Cuenta (camarero1, mesa1);
		Cuenta cuenta2 = new Cuenta(camarero2, mesa2);
		
		ArrayList<Cuenta> cuentas_prueba = new ArrayList<>();
		
		cuentas_prueba.add(cuenta1);
		cuentas_prueba.add(cuenta2);
		
		
		for(Cuenta cuenta : cuentas_prueba) {
			insertarCuenta(cuenta);
		}
		
		
		
		
		
		

	}

}
