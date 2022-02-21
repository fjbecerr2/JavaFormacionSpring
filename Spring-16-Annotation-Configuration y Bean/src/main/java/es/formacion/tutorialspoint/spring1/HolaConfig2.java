package es.formacion.tutorialspoint.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Esta clase sustituye al XML
@Configuration
public class HolaConfig2 {
	
	 @Bean 
	 public Hola2 hola2(){
		 //Aprovechamos y le inyectamos otro bean en el constructor
	     return new Hola2(hola3());
	  }
	 
	 @Bean
	 public Hola3 hola3() {
	     return new Hola3();
	 }
	
}
