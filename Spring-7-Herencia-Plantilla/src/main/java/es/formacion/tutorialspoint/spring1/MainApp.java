package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO DE HERENCIA CON PLANTILLA EN BEANS
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola");    
		obj1.getMessage1();
		obj1.getMessage2();
		obj1.getMessage3();
			
		
	}

}
