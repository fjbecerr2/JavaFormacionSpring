package es.formacion.tutorialspoint.spring1;

public class Hola3 {
	private String message="Mensaje por defecto";
	
	public void setMessage(String message){
	      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE 3] : " + message);
	}
	
	

}
