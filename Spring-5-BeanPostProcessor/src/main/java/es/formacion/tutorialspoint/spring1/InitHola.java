package es.formacion.tutorialspoint.spring1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHola implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("Antes inicializar : " + beanName);
      return bean;  // you can return any other object as well
	}
		   
	public Object postProcessAfterInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("Despues de inicializar : " + beanName);
      return bean;  // you can return any other object as well
	}

}
