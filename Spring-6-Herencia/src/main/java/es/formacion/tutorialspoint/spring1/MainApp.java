package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO DE HERENCIA EN BEANS
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola1");    
		obj1.getMessage();
		obj1.getMessage2();
		
		Hola obj2 = (Hola) context.getBean("hola2");    
		obj2.getMessage();
		obj2.getMessage2(); //Este bean es herencia
		
		//Creamos un tercer objeto bean pero este tiene su propia clase
		Hola3 obj3 = (Hola3) context.getBean("hola3");    
		obj3.getMessage();
		obj3.getMessage2(); //Este bean es herencia 
		obj3.getMessage3(); 
		
		
	}

}
