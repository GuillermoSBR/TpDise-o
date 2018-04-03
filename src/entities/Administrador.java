package entities;
import java.time.*;



public class Administrador {

	private String NombreYApellido;
	private String Domicilio;
	private LocalTime FechaAlta;
	private int NumeroId;
	private String NombreUsuario;
	private String Contraseña;

	public Administrador(){

	}

	
	public int mesesQueLlevaSiendoAdmin(){
		return 0;
	}
}