package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/****
 * EJEMPLO DE COLECCIONES CON ELEMENTOS DINAMICOS
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola hola=(Hola)context.getBean("hola");

		hola.getAddressList();
		hola.getListaElementos();
		
	}

}
