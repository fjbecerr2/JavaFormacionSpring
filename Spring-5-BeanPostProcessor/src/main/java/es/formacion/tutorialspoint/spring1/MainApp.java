package es.formacion.tutorialspoint.spring1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO SIMPLE DE LOS DOS METODOS SIMPLES PARA CREAR UN BEAN
 * Y USO DEL INTERFACE BeanPostProcessor que permite lanzar metodos
 * previos y posteriores al init del beans
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
	    Hola obj = (Hola) context.getBean("hola1");
	    obj.getMessage();
	    obj = (Hola) context.getBean("hola2");
	    obj.getMessage();
	    context.registerShutdownHook(); //cierra en orden
	    //context.close();
	}

}
