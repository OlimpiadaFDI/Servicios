package com.fdi.olimpiada.integration.persistence.facade.iface.dto;


/**
 * 
 * @author agonzalez
 *
 */

public class UsuarioFacadeRequestDTO {
	
	
	private String nombre;
	private String correo;
	private String pass;

	
	public UsuarioFacadeRequestDTO(){
		super();
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioFacadeRequestDTO [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (correo != null) {
			builder.append("correo=");
			builder.append(correo);
			builder.append(", ");
		}
		if (pass != null) {
			builder.append("pass=");
			builder.append(pass);
		}
		builder.append("]");
		return builder.toString();
	}

}
