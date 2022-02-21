package es.formacion.tutorialspoint.spring1;

public class Hola {
	private String message;

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE] : " + message);
	}
	
	public void initParaBeans() {
		System.out.println("[MENSAJE INIT]");
	}
	public void destroyParaBeans() {
		System.out.println("[MENSAJE DESTROY]");
	}
	
}
