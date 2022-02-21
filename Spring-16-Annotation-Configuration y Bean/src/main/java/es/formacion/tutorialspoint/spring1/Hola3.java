package es.formacion.tutorialspoint.spring1;

public class Hola3 {
	private String message;

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE HOLA3] : " + message);
	}
	
}
