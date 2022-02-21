package es.formacion.tutorialspoint.spring1;

public class Hola3 {
	private String message;
	private Hola4 hola4;
	
	//Creamos el constructor para el autowire
	public Hola3(Hola4 hola4) {
		this.hola4 =hola4;
	}
	public void showHola3() {
		this.hola4.getMessage();
	}

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE 3] : " + message);
	}
	
	public Hola4 getHola4() {
		return this.hola4;
	}
	
	
}
