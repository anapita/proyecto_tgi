package controlador;

import java.sql.Connection;

public class SQLShow {
	
	//Mostrar Camarero
	
	public static void mostrarCamarero ()
	{
		
		SQLConnect sqlconnect = new SQLConnect();

		Connection c = sqlconnect.getC();

		Statement stm1 = c.createStatement();
		String
				
				
		sqlconnect.cerrarConexion();
	}	
	
	

}
