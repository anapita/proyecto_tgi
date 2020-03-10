package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Camarero;
import modelo.Mesa;

public class SQLConsulta {

	public static Integer consultarCamareroId(Camarero camarero) {
		try {
			PreparedStatement s = SQLConnect.getC().prepareStatement("SELECT id FROM Camareros WHERE DNI=?");
			
			s.setString(1, camarero.getDni());
			
			ResultSet rs = s.executeQuery();
			Integer id = null;
			while(rs.next()) {
			id = rs.getInt("id");
			}
			return id;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static Integer consultarMesaId(Mesa mesa) {
		try {
			PreparedStatement s = SQLConnect.getC().prepareStatement("SELECT id FROM Mesas WHERE Num_Personas=?");
			
			s.setInt(1, mesa.getNum_personas());
			
			ResultSet rs = s.executeQuery();
			Integer id = null;
			while(rs.next()) {
			id = rs.getInt("id");
			}
			return id;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
