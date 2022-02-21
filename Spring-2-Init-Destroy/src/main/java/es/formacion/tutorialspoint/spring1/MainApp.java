package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/****
 * EJEMPLO SIMPLE DE LOS DOS METODOS SIMPLES PARA CREAR UN BEAN
 * Y USO DE METODOS init-method , destroy-method Y lazy-init
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		//Maneras de cargar un bean
		//Indicando la ruta
		context = new FileSystemXmlApplicationContext
		         ("C:\\Users\\francisco.becerra\\eclipse-workspace-Spring\\Spring-1\\src\\main\\java\\Beans.xml");
		Hola obj1 = (Hola) context.getBean("hola1");    
	    obj1.getMessage(); 
	   
	    
		
	    //Usando el classpath
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj2 = (Hola) context.getBean("hola2");
		obj2.getMessage();
		
		//Hay que hacer un cast para cerrar por que los objetos con los que
		//se ha creado no lo permiten.
		((AbstractApplicationContext) context).close();
	}

}
