package vista;

import controlador.SQLTables;

public class PrincipalAux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SQLTables.crearTablas();
		
		/*MetodosMenu.insertarDatosPrueba();*/
		
		SQLTables.borrarTablas();
		
		
		
		

	}

}
