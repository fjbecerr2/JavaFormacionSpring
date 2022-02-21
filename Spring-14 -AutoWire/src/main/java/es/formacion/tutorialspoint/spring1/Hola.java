package es.formacion.tutorialspoint.spring1;

public class Hola {
	private String message;
	private Hola2 hola2;
	
	
	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE] : " + message);
	}
	
	public void setHola2(Hola2 hola2) {
		this.hola2 =hola2;
	}
	public Hola2 getHola2() {
		return this.hola2;
	}
	
	public void showDatos() {
		System.out.println("[MENSAJE] : " + message);
		hola2.getMessage();
		//Llamamos al hola3 por mediacion de hola2
		hola2.getHola3().getMessage();
		hola2.getHola3().getHola4().getMessage();
	}
	
}
