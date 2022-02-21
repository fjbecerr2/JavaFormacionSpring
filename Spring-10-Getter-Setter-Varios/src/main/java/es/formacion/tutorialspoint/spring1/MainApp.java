package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO DE INYECCIÓN DE DEPENDENCIAS Varios SETTER Y GETTER 
 * SIN Y CON NAMESPACE
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola");     
		obj1.metodoHola();
		
		Hola obj2 = (Hola) context.getBean("hola");     
		obj2.metodoHola2();
		
		Hola obj3 = (Hola) context.getBean("jane");     
		obj3.metodoHola3();
		
		Hola obj4 = (Hola) context.getBean("hola");     
		obj4.metodoHola3();
		
	}

}
