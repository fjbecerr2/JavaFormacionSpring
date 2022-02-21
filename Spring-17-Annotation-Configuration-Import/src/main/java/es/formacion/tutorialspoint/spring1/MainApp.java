package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/****
 * EJEMPLO DE USO DE ANNOTATIONS - IMPORT
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		//Usamos el una clase y no un XML
		context = new AnnotationConfigApplicationContext(ConfigNombreApellidos.class);
		Nombre oNombre = context.getBean(Nombre.class);
		//Podemos usar estos bean porque esta importado dentro de ConfigNombreApellidos
		/* La alternativa seria
		 * context.register(ConfigNombreApellidos.class, ConfigDireccionTelefono.class);
		 */
		Direccion oDireccion =context.getBean(Direccion.class);
		Telefono oTelefono =context.getBean(Telefono.class);
		
		//Asignamos los valores
		oNombre.setNombre("Pepe");
		oNombre.setApellidos("Gutierrez Aragon");
		oDireccion.setDireccion("C/ Parra N.23");
		oTelefono.setTelefono("9876534546");
		
		System.out.println("[NOMBRE] "+oNombre.getNombre());
		System.out.println("[APELLIDOS] "+oNombre.getApellidos());
		System.out.println("[DIRECCION] "+oDireccion.getDireccion());
		System.out.println("[TELEFONO] "+oTelefono.getTelefono());
		
		//Hay que hacer un cast para cerrar por que los objetos con los que
		//se ha creado no lo permiten.
		//((AbstractApplicationContext) context).close();
		 ((AbstractApplicationContext) context).registerShutdownHook(); //Esto es como un close
	}

}
