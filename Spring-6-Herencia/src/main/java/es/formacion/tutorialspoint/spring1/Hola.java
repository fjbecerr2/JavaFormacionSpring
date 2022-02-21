package es.formacion.tutorialspoint.spring1;

public class Hola {
	private String message;
	private String message2;
	
	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE] : " + message);
	}
	
	public void setMessage2(String message){
	      this.message2  = message;
	}
	
	public void getMessage2(){
		System.out.println("[MENSAJE] : " + message2);
	}
	
}
