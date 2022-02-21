package es.formacion.tutorialspoint.spring1;

public class Hola {
	
	//Creamos el objeto que se inyecta en el constructor
	private HolaInyeccion holaInyeccion;
		
	//Setter y Getter
	//para nombrar es necesario set+nombre del bean o no lo detecta
	public void setHolaInyeccion(HolaInyeccion holaInyeccion) {
		System.out.println("[SET HOLA]");
		this.holaInyeccion =holaInyeccion; //Inyectamos
	}
	
	public HolaInyeccion getHolaInyeccion() {
		System.out.println("[GET HOLA]");
		return this.holaInyeccion;
	}
	
	public void metodoHola() {
		this.holaInyeccion.UsandoHolaInyeccion();
	}
	
	
}
	