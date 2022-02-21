package es.formacion.tutorialspoint.spring1;

public class Hola2 {
	private String message;
	private Hola3 hola3;

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE 2] : " + message);
	}
	
	public void setHola3(Hola3 hola3) {
		this.hola3 =hola3;
	}
	public Hola3 getHola3() {
		return this.hola3;
	}
	
}
