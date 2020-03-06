package vista;

import java.sql.SQLException;
import java.util.ArrayList;

import controlador.SQLInsert;
import modelo.*;

public class MetodosMenu {

	public static void insertarDatosPrueba() {

		Camarero camarero1 = new Camarero("Javier", "Martin", "54298855H", 15000);
		Camarero camarero2 = new Camarero("Carolina", "Begara", "54298857C", 14000);
		Camarero camarero3 = new Camarero("Ana", "Pita", "54298827J", 20000);

		ArrayList<Camarero> camareros_prueba = new ArrayList<>();

		camareros_prueba.add(camarero1);
		camareros_prueba.add(camarero2);
		camareros_prueba.add(camarero3);

		for (Camarero camarero : camareros_prueba) {

			SQLInsert.insertarCamarero(camarero);

		}
		
		Mesa mesa1 = new Mesa (6);
		
		Cuenta cuenta1 = new Cuenta ('2020-03-01', camarero1, mesa1);
		
		
		
		
		
		

	}

}
