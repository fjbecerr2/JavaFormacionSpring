package es.formacion.tutorialspoint.spring1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Hola {
	
	//Colecciones Java
	List<String> addressList;
	Set<String>  addressSet;
	Map<String, String>  addressMap;
	Properties addressProp;

	//SET DE LAS COLECCIONES
   public void setAddressList(List<String> addressList) {
      this.addressList = addressList;
   }
   
   public void setAddressSet(Set<String> addressSet) {
      this.addressSet = addressSet;
   }
   
   public void setAddressMap(Map<String, String> addressMap) {
      this.addressMap = addressMap;
   }
   
   public void setAddressProp(Properties addressProp) {
      this.addressProp = addressProp;
   }
   
   //GET DE LAS COLECCIONES
   public List<String> getAddressList() {
      System.out.println("List Elements :"  + addressList);
      return addressList;
   }
   
   public Set<String> getAddressSet() {
      System.out.println("Set Elements :"  + addressSet);
      return addressSet;
   }
   
   public Map<String, String> getAddressMap() {
      System.out.println("Map Elements :"  + addressMap);
      return addressMap;
   }
  
   public Properties getAddressProp() {
      System.out.println("Property Elements :"  + addressProp);
      return addressProp;
   }
	
}
