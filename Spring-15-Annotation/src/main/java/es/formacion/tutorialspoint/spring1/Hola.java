package es.formacion.tutorialspoint.spring1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Hola {
	private String message;
	private String nombre;
	private Apellidos apellidos;
	//Esta Autowired evita la necesidad del setter ya que se asocia al objeto
	@Autowired
	private Dni dni;
	private Edad edad;
	
	//Usando Qualifier se distingue que bean tratar
	//De lo contrario daria error
	@Autowired
	@Qualifier("direccion1")
	private Direccion direccion;
	
	//@Resourde es como usar byname
	@Resource(name = "telefono")
	private Telefono telefono;
	
	//Creamos un constructor con Autowired para la Edad
	// @Autowired(required=false) funciona como el required forzando el parametro
	@Autowired
	public Hola(Edad edad) {
		this.edad =edad;
	}
	
	//@equired lanza excepcion si el parametro no esta asignado en el bean
	@Required
	public void setMessage(String message){
      this.message  = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	@Required
	public void setNombre(String nombre) {
		this.nombre =nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	//Este Autowired afecta al set
	@Autowired
	public void SetApellidos(Apellidos apellidos) {
		this.apellidos =apellidos;
	}
	public Apellidos getApellidos() {
		return this.apellidos;
	}
	
	public Dni getDni() {
		return this.dni;
	}
	
	public Edad getEdad() {
		return this.edad;
	}
	
	public void getDireccion(Direccion direccion) {
		this.direccion =direccion;
	}
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	public void setTelefono(Telefono telefono) {
		this.telefono =telefono;
	}
	public Telefono getTelefono() {
		return this.telefono;
	}
	
}
