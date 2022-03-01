package modelos;

public class Genero {
	private int idGenero;
	private String nombre;
	private boolean activo;
	
	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genero(int idGenero, String nombre, boolean activo) {
		super();
		this.idGenero = idGenero;
		this.nombre = nombre;
		this.activo = activo;
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
