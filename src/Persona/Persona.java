package Persona;
//Id, primerNombre, segundoNombre, primerApellido, segundoApellido, genero, dpi, edad, ciudad.
public class Persona {

	private int Id;
	private String primerNombre; 
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido ;
	private String genero;
	private String dpi ;
	private int edad;
	private String ciudad;
	
	
	public Persona(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String genero, String dpi, int edad, String ciudad) {
		super();
		Id = id;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.dpi = dpi;
		this.edad = edad;
		this.ciudad = ciudad;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getPrimerNombre() {
		return primerNombre;
	}


	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}


	public String getSegundoNombre() {
		return segundoNombre;
	}


	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	 public String getDpi() {
	        return dpi;
	    }

	    public void setDpi(String dpi) {
	        this.dpi = dpi;
	    }


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	 public String getNombreCompleto() {
	        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
	    }
}
