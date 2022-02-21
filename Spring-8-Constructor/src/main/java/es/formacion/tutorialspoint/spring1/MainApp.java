package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO DE INYECCIÓN DE DEPENDENCIAS CON CONTRUCTOR
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola");     
		obj1.metodoHola();
		
		//Inyeccion con dos parametros
		Hola obj2 = (Hola) context.getBean("holaparam");     
		obj2.metodoHola();
		obj2.metodoHola2();
		
		//Inyeccion con dos parametros que no son bean/class
		Hola obj3 = (Hola) context.getBean("holaparamcontipo");     
		obj3.getEdadNombre();
		
		//Parametros que no son bean/class suministrados con indice
		Hola obj4 = (Hola) context.getBean("holaparamindex");     
		obj4.getNombreAlturaEdad();
	}

}
