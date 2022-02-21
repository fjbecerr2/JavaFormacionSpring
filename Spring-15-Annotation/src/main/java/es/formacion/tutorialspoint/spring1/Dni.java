package es.formacion.tutorialspoint.spring1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dni {
	private String dni;
	
	public void setDni(String dni) {
		this.dni =dni;
	}
	public String getDni() {
		return this.dni;
	}

	//Funcionan como init y destroy
	@PostConstruct
   public void init(){
      System.out.println("- Bean iniciado DNI-");
   }
   
   @PreDestroy
   public void destroy(){
      System.out.println("- Bean destruido DNI-");
   }
   
   @PostConstruct
   public void init2(){
      System.out.println("- Bean iniciado2 DNI-");
   }
   
   @PreDestroy
   public void destroy2(){
      System.out.println("- Bean destruido2 DNI-");
   }
}
