package modelos;

import java.util.List;

public class Pelicula {
	
	private int idPelicula;
	private String titulo;
	private String tipoMetraje;
	private Nacionalidad nacionalidad;
	private Clasificacion clasificacion;
	private String duracion;
	private String sinopsis;
	private List<Genero> generos;
	private List<Idioma> idiomas;
	
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(int idPelicula, String titulo, String tipoMetraje, Nacionalidad nacionalidad,
			Clasificacion clasificacion, String duracion, String sinopsis, List<Genero> generos, List<Idioma> idiomas) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.tipoMetraje = tipoMetraje;
		this.nacionalidad = nacionalidad;
		this.clasificacion = clasificacion;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
		this.generos = generos;
		this.idiomas = idiomas;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoMetraje() {
		return tipoMetraje;
	}

	public void setTipoMetraje(String tipoMetraje) {
		this.tipoMetraje = tipoMetraje;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	
	

}
