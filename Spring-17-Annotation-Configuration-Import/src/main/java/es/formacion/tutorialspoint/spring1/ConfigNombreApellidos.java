package es.formacion.tutorialspoint.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*Importamos el otro config*/
@Configuration
@Import(ConfigDireccionTelefono.class)
public class ConfigNombreApellidos {
	
	@Bean
	public Nombre nombre() {
		return new Nombre();
	}
	
}
