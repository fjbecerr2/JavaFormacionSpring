package es.formacion.tutorialspoint.spring1;

import org.springframework.beans.factory.annotation.Required;

public class Nombre {
	private String nombre;
	private String apellidos;
	
	/* Si usamos el constructor habria que poner valores
	 * fijo en el bean del Config
	 */
	/*public Nombre(String nombre) {
		this.nombre =nombre;
	}*/
	
	@Required
	public void setNombre(String nombre) {
		this.nombre =nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	@Required
	public void setApellidos(String apellidos) {
		this.apellidos =apellidos;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
}
