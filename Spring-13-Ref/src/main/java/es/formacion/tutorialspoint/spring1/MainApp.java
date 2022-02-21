package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/****
 * EJEMPLO SIMPLE USAR DATOS EXTRAIDOS DE OTROS BEAN
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
				
	    //Usando el classpath
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola");
		obj1.getMessage();
		obj1.getHolaRef().showHolaRef();
		obj1.showListaPaises();
	}

}
