package controlador;

import java.sql.*;

public class SQLTables {

	public static void crearTablas() {

		SQLConnect sqlconnect = new SQLConnect();

		Connection c = sqlconnect.getC();

		try {

			// Tabla Bebida

			Statement stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE IF NOT EXISTS Bebidas" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Nombre TEXT NOT NULL," + "Precio INTEGER)";
			stmt1.executeUpdate(sql1);
			stmt1.close();

			// Tabla Camarero

			Statement stmt2 = c.createStatement();
			String sql2 = "CREATE TABLE IF NOT EXISTS Camareros" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Nombre TEXT NOT NULL," + "Apellido TEXT NOT NULL," + "DNI TEXT NOT NULL, "
					+ "Sueldo INTEGER NOT NULL)";

			stmt2.executeUpdate(sql2);
			stmt2.close();

			// Tabla Cuenta

			Statement stmt3 = c.createStatement();
			String sql3 = "CREATE TABLE IF NOT EXISTS Cuentas" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "id_Camarero INTEGER," + "id_Mesa INTEGER," + "Fecha TEXT NOT NULL," + "Importe REAL,"
					+ "Metodo_pago TEXT," + "Pago_recibido NUMERIC NOT NULL,"
					+ "FOREIGN KEY(id_Camarero) REFERENCES Camareros(id)"
					+ "FOREIGN KEY (id_Mesa) REFERENCES Mesas(id))";

			stmt3.executeUpdate(sql3);
			stmt3.close();

			// Tabla Ingrediente

			Statement stmt4 = c.createStatement();
			String sql4 = "CREATE TABLE IF NOT EXISTS Ingredientes" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Nombre TEXT NOT NULL," + "Precio REAL NOT NULL)";

			stmt4.executeUpdate(sql4);
			stmt4.close();

			// Tabla Mesa

			Statement stmt5 = c.createStatement();
			String sql5 = "CREATE TABLE IF NOT EXISTS Mesas" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Num_Personas INTEGER)";

			stmt5.executeUpdate(sql5);
			stmt5.close();

			// Tabla PLato

			Statement stmt6 = c.createStatement();
			String sql6 = "CREATE TABLE IF NOT EXISTS Platos" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ "Nombre TEXT NOT NULL," + "Precio REAL NOT NULL)";

			stmt6.executeUpdate(sql6);
			stmt6.close();

			// Tabla de relacion platos_cuenta

			Statement stmt7 = c.createStatement();
			String sql7 = "CREATE TABLE IF NOT EXISTS Platos_Cuentas" + "(id_Cuenta INTEGER NOT NULL,"
					+ "id_Plato INTEGER NOT NULL," + "Unidades INTEGER NOT NULL,"
					+ "FOREIGN KEY(id_Cuenta) REFERENCES Cuentas(id)," + "FOREIGN KEY (id_Plato) REFERENCES Platos(id),"
					+ "PRIMARY KEY (id_Cuenta,id_Plato))";

			stmt7.executeUpdate(sql7);
			stmt7.close();

			// Tabla de relacion Bebidas_cuenta

			Statement stmt8 = c.createStatement();
			String sql8 = "CREATE TABLE IF NOT EXISTS Bebidas_Cuentas" + "(id_Cuenta INTEGER NOT NULL,"
					+ "id_Bebida INTEGER NOT NULL," + "Unidades INTEGER NOT NULL,"
					+ "FOREIGN KEY(id_Cuenta) REFERENCES Cuentas(id),"
					+ "FOREIGN KEY (id_Bebida) REFERENCES Bebidas(id)," + "PRIMARY KEY (id_Cuenta,id_Bebida))";

			stmt8.executeUpdate(sql8);
			stmt8.close();

			// Tabla de relacion Ingrediente_Plato

			Statement stmt9 = c.createStatement();
			String sql9 = "CREATE TABLE IF NOT EXISTS Ingredientes_Platos" + "(id_Ingrediente INTEGER NOT NULL,"
					+ "id_Plato INTEGER NOT NULL," + "Cantidad INTEGER NOT NULL,"
					+ "FOREIGN KEY(id_Ingrediente) REFERENCES Ingredientes(id),"
					+ "FOREIGN KEY (id_Plato) REFERENCES Platos(id)," + "PRIMARY KEY (id_Ingrediente,id_Plato))";

			stmt9.executeUpdate(sql9);
			stmt9.close();

			sqlconnect.cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void borrarTablas() {

		SQLConnect sqlconnect = new SQLConnect();

		Connection c = sqlconnect.getC();

		try {

			// Tabla Bebidas

			Statement stmt1;
			stmt1 = c.createStatement();
			String sql1 = "DROP TABLE Bebidas";
			stmt1.executeUpdate(sql1);
			stmt1.close();

			// Tabla Camareros

			Statement stmt2;
			stmt2 = c.createStatement();
			String sql2 = "DROP TABLE Camareros";
			stmt2.executeUpdate(sql2);
			stmt2.close();

			// Tabla Cuentas

			Statement stmt3;
			stmt3 = c.createStatement();
			String sql3 = "DROP TABLE Cuentas";
			stmt3.executeUpdate(sql3);
			stmt3.close();

			// Tabla Ingredientes

			Statement stmt4;
			stmt4 = c.createStatement();
			String sql4 = "DROP TABLE Ingredientes";
			stmt4.executeUpdate(sql4);
			stmt4.close();

			// Tabla Mesas

			Statement stmt5;
			stmt5 = c.createStatement();
			String sql5 = "DROP TABLE Mesas";
			stmt5.executeUpdate(sql5);
			stmt5.close();

			// Tabla Platos

			Statement stmt6;
			stmt6 = c.createStatement();
			String sql6 = "DROP TABLE Platos";
			stmt6.executeUpdate(sql6);
			stmt6.close();

			// Tabla de relacion platos_cuenta

			Statement stmt7;
			stmt7 = c.createStatement();
			String sql7 = "DROP TABLE Platos_Cuentas";
			stmt7.executeUpdate(sql7);
			stmt7.close();

			// Tabla de relacion bebidas_cuenta

			Statement stmt8;
			stmt8 = c.createStatement();
			String sql8 = "DROP TABLE Bebidas_Cuentas";
			stmt8.executeUpdate(sql8);
			stmt8.close();

			// Tabla de relacion ingredientes_platos

			Statement stmt9;
			stmt9 = c.createStatement();
			String sql9 = "DROP TABLE Ingredientes_Platos";
			stmt9.executeUpdate(sql9);
			stmt9.close();

			sqlconnect.cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
