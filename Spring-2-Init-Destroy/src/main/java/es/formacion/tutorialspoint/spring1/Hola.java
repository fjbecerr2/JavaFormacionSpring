package es.formacion.tutorialspoint.spring1;

public class Hola {
	private String message;

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE] : " + message);
	}
	
	public void mensajeInicial() {
		System.out.println("[MENSAJE INICIAL] ");
	}
	
	public void mensajeDestroy() {
		System.out.println("[MENSAJE DESTROY] ");
	}
}
