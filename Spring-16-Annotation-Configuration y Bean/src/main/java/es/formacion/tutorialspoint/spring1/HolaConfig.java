package es.formacion.tutorialspoint.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Esta clase sustituye al XML
@Configuration
public class HolaConfig {
	
	 @Bean 
	 public Hola hola(){
	      return new Hola();
	   }
	
}
