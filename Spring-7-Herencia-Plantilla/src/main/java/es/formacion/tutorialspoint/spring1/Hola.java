package es.formacion.tutorialspoint.spring1;

public class Hola {
	private String message1;
	private String message2;
	private String message3;
	
	public void setMessage1(String message){
      this.message1  = message;
	}
	
	public void getMessage1(){
		System.out.println("[MENSAJE] : " + message1);
	}
	
	public void setMessage2(String message){
	      this.message2  = message;
	}
	
	public void getMessage2(){
		System.out.println("[MENSAJE] : " + message2);
	}
	
	//Estos metodos estan asociados al bean de la plantilla
	public void setMessage3(String message){
	      this.message3  = message;
	}
	
	public void getMessage3(){
		System.out.println("[MENSAJE] : " + message3);
	}
	
}
