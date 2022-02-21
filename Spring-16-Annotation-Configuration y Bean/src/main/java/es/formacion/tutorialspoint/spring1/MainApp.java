package es.formacion.tutorialspoint.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/****
 * EJEMPLO USAR UNA CLASE COMO CONFIGURACION Y CONTENEDOR DE BEAN
 * EN LUGAR DEL XML
 * @author francisco.becerra
 *
 */

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		
	    //Usando el classpath
		/*context = new ClassPathXmlApplicationContext("Beans.xml");
		Hola obj2 = (Hola) context.getBean("hola2");
		obj2.getMessage();*/
		
		/*Este codigo sustituye en xml del codigo previo*/
		
		context = new AnnotationConfigApplicationContext(HolaConfig.class);
		   
	   Hola hola = context.getBean(Hola.class);
	   hola.setMessage("Mensaje Spring!");
	   hola.getMessage();
	   
	   ((AbstractApplicationContext) context).close();
	   
	   /*Pasamos varias class como bean en la misma linea
	    * Tambien se podrian una tras otra cada una con su register*/
	   AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();

	   context2.register(HolaConfig.class, HolaConfig2.class);
	   //ctx.register(OtraConfig.class);
	   context2.refresh();
	   
	   /*Una vez declarados podemos crear los objetos y usarlos*/
	   hola = context2.getBean(Hola.class);
	   hola.setMessage("Mensaje Spring 2!");
	   hola.getMessage();
	   
	   Hola2 hola2 = context2.getBean(Hola2.class);
	   hola2.setMessage("Mensaje Spring 3!");
	   //Este es un bean inyectado en el constructor y configurado en HolaConfig2
	   hola2.setMessageHola3("Mensaje Spring 4!");
	   hola2.getMessage();
	   
	   context2.close();
	   
	   
	   
	}

}
