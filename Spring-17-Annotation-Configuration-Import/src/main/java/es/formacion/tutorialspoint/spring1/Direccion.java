package es.formacion.tutorialspoint.spring1;

public class Direccion {
	String direccion;
	
	public void setDireccion(String direccion) {
		this.direccion =direccion;
	}
	public String getDireccion() {
		return this.direccion;
	}

	//Se establecen estos metodos en ConfigDireccionTelefono
	public void initDireccion() {
		System.out.println("Iniciando Direccion");
	}
	public void destroyDireccion() {
		System.out.println("Cerrando Direccion");
	}
}
