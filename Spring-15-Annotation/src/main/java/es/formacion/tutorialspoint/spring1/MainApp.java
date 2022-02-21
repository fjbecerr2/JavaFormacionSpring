package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO DE USO DE ANNOTATIONS
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
	    //Usando el classpath
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj = (Hola) context.getBean("hola");
		System.out.println("[MENSAJE] "+obj.getMessage());
		System.out.println("[NOMBRE] "+obj.getNombre());
		//Traemos los apellidos a traves del bean hola
		System.out.println("[APELLIDOS] "+obj.getApellidos().getApellidos());
		System.out.println("[DNI] "+obj.getDni().getDni());
		System.out.println("[EDAD] "+obj.getEdad().getEdad());
		System.out.println("[DIRECCION] "+obj.getDireccion().getDireccion());
		System.out.println("[TELEFONO] "+obj.getTelefono().getTelefono());
		
		//Hay que hacer un cast para cerrar por que los objetos con los que
		//se ha creado no lo permiten.
		//((AbstractApplicationContext) context).close();
		 ((AbstractApplicationContext) context).registerShutdownHook(); //Esto es como un close
	}

}
