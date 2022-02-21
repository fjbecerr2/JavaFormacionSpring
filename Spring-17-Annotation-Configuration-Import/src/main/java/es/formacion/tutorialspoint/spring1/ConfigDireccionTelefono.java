package es.formacion.tutorialspoint.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigDireccionTelefono {
	
	//Indicamos el bean y los metodos init y destroy
	@Bean(initMethod = "initDireccion", destroyMethod = "destroyDireccion" )
	public Direccion direccion() {
		return new Direccion();
	}

	//Indicamos el bean y el scope
	@Bean
	@Scope("prototype")
	public Telefono telefono() {
		return new Telefono();
	}
}
