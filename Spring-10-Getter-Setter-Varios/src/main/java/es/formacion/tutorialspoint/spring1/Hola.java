package es.formacion.tutorialspoint.spring1;

public class Hola {
	
	//Creamos el objeto que se inyecta en el constructor
	private HolaInyeccion holaInyeccion;
	private String holaInyeccion2;
	private String holaInyeccion3;

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
	
	
	//Segundo Setter y getter que no usa el objeto sino un valor de bean
	public void setHolaInyeccion2(String holaInyeccion2) {
		System.out.println("[SET HOLA 2]");
		this.holaInyeccion2 =holaInyeccion2; //Inyectamos
	}
	
	public String getHolaInyeccion2() {
		System.out.println("[GET HOLA 2]");
		return this.holaInyeccion2;
	}
	
	public void setHolaInyeccion3(String holaInyeccion3) {
		System.out.println("[SET HOLA 3]");
		this.holaInyeccion3 =holaInyeccion3; //Inyectamos
	}
	
	public String getHolaInyeccion3() {
		System.out.println("[GET HOLA 3]");
		return this.holaInyeccion3;
	}
	
	
	
	
	//--- SALIDAS
	public void metodoHola() {
		this.holaInyeccion.UsandoHolaInyeccion();
	}
	public void metodoHola2() {
		System.out.println(this.holaInyeccion2);
	}
	public void metodoHola3() {
		System.out.println(this.holaInyeccion3);
	}
	

	
	
	
}
	