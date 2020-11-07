package edu.cientifica.metrofacilx.model;

public class Usuario {
	//Attributes
	private int dni;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String password;
	private String correo;
	//Constructor
	public Usuario (int dni, String nombre, String apellidoPaterno, String apellidoMaterno, String password,String correo) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.password=password;
		this.correo=correo;
	}
	
	public Usuario( String correo, String password) {
		super();
		this.correo = correo;
		this.password = password;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passwword) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	};
	
}
