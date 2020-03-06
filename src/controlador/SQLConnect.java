package controlador;

import java.sql.*;

public class SQLConnect {

	private static Connection c;

	public SQLConnect() {

		try {
			// open database connection
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:./db/restaurant.db");

			c.createStatement().execute("PRAGMA foreign_keys=ON");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cerrarConexion() {

		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getC() {
		return c;
	}

}
