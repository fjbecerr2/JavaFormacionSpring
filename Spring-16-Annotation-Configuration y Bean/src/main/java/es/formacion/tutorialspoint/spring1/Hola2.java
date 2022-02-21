package es.formacion.tutorialspoint.spring1;

public class Hola2 {
	private String message;
	private Hola3 hola3;
	
	/* Inyectamos un bean en el constructor que hemos
	 * asociado en el HolaConfig3
	 */
	
	public Hola2(Hola3 hola3) {
		this.hola3 =hola3;
	}

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE HOLA2] : " + message);
		hola3.getMessage();
	}
	
	public void setMessageHola3(String message) {
		hola3.setMessage(message);
	}
}
