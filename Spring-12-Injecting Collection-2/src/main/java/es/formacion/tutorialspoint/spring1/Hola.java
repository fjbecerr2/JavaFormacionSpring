package es.formacion.tutorialspoint.spring1;

import java.util.List;
/*import java.util.Map;
import java.util.Properties;
import java.util.Set;*/

public class Hola {
	
	//Colecciones Java
	List<String> addressList;
	List<String> mylistaElementos;
	
	Elementos elemento1;
	ListaElementos listaElementos;
	ListaElementos2 listaElementos2;
	
	public void setElemento1(Elementos elemento1) {
		this.elemento1 =elemento1;
	}
	
	public void getElemento1() {
		System.out.println("[ELEMENTO 1] "+this.elemento1.getElemento1());
		addressList.add(this.elemento1.getElemento1());
	}

	//SET DE LAS COLECCIONES
   public void setAddressList(List<String> addressList) {
      this.addressList = addressList;
   }
   //Operaciones al lanzar sobre los beans
   //Asignamos los elementos de la primera lista
   public void setListaElementos(ListaElementos listaElementos) {
	  this.mylistaElementos = listaElementos.getListaElementos();
   }
   //Insertamos los elementos de la segunda lista en la primera
   public void setListaElementos2(ListaElementos2 listaElementos2) {
	  this.mylistaElementos.addAll(listaElementos2.getListaElementos2());
   }
   
   //GET DE LAS COLECCIONES
   public List<String> getAddressList() {
	   getElemento1();
      System.out.println("List Elementos :"  + addressList);
      return addressList;
   }
  
   //La lista de elementos no lanza desde los bean
   //pero se rellena con los bean
   public List<String> getListaElementos() {
      System.out.println("Lista Elementos :"  + mylistaElementos);
      return mylistaElementos;
   }

	
}
