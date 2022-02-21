package es.formacion.tutorialspoint.spring1;

public class Hola {
	
	private Hola3 hola3;
		
	public void setHola3(Hola3 hola3){
		System.out.println("[SET HOLA3]");
		this.hola3  = hola3;
	}
	
	public void getHola3(){
		System.out.println("[GET HOLA3] : " + this.hola3);
	}

	public void verHola3() {
		this.hola3.getMessage();
	}
	
}
