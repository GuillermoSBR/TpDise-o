package entities;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public abstract class Cliente {

	private String NombreYApellido;
	//private Documento TipoYNumeroDeDocumento;
	private int TelefonoContacto;
	private String Domicilio;
	private LocalTime FechaAlta;
	private String NombreUsuario;
	private String Constraseña;
	private List<Dispositivo> documentos;
	

	public  Cliente(){
		
		documentos = new ArrayList<>();

	}

	
	public boolean algunDispositivoEstaEncendido(){
		return false;
	}

	public int cantDispositivosEncendidos(){
		return 0;
	}

	public int cantDispositivosApagados(){
		return 0;
	}

	public int dispositivosTotales(){
		return 0;
	}
}