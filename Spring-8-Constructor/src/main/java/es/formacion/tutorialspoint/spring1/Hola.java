package es.formacion.tutorialspoint.spring1;

public class Hola {
	
	//Creamos el objeto que se inyecta en el constructor
	private HolaInyeccion holaInyeccion;
	private HolaInyeccion2 holaInyeccion2;
	
	//Objetos para constructor con parametros
	private int edad;
	private String nombre;
	
	private String altura;
	
	//Constructor estandar
	public Hola(HolaInyeccion holaInyeccion) {
		System.out.println("[CONSTRUCTOR HOLA]");
		this.holaInyeccion =holaInyeccion; //Inyectamos
	}
	
	//Constructor con parametros
	//Los parametros se corresponde con el orden indicado en el bean
	public Hola(HolaInyeccion holaInyeccion, HolaInyeccion2 holaInyeccion2) {
		System.out.println("[CONSTRUCTOR HOLA]: ");
		this.holaInyeccion =holaInyeccion; //Inyectamos
		this.holaInyeccion2 =holaInyeccion2; //Inyectamos
		
	}
	
	//Constructor con parametros de tipo (que no son beans)
	public Hola(int edad, String nombre) {
		this.edad =edad;
		this.nombre =nombre;
	}
	
	//Constructor con parametros index  de tipo (que no son beans)
	public Hola(int edad, String altura, String nombre) {
		this.edad =edad;
		this.nombre =nombre;
		this.altura =altura;
	}
	
	public void metodoHola() {
		this.holaInyeccion.UsandoHolaInyeccion();
	}
	
	public void metodoHola2() {
		this.holaInyeccion2.UsandoHolaInyeccion();	
	}
	
	public void getEdadNombre() {
		System.out.println("Edad: "+this.edad+" Nombre :"+this.nombre);
	}
	
	public void getNombreAlturaEdad() {
		System.out.println("Nombre: "+this.nombre+" Altura: "+this.altura+" Edad: "+this.edad);
	}
}
	