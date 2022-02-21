package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/****
 * EJEMPLO SIMPLE DE LOS DOS METODOS SIMPLES PARA CREAR UN BEAN
 * Y USO DE METODO INIT Y DESTROY POR DEFECTO PARA VARIOS BEAN
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
		//Asignamos un nuevo mensaje al primer objeto
	    obj1.setMessage("Mensaje obj1");
	    obj1.getMessage();
		 ((AbstractApplicationContext) context).close();
	    
		
	    //Usando el classpath
		context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj2 = (Hola) context.getBean("hola2");
		obj2.getMessage();
		((AbstractApplicationContext) context).close();
		 
	
	}

}
