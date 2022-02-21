package es.formacion.tutorialspoint.spring1;

import java.util.List;
//import java.util.ArrayList; // import the ArrayList class

public class Hola {
	private String message;
	private HolaRef holaRef;
	private List<String> listaPaises;
	
	private String otroPais;

	public void setMessage(String message){
      this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("[MENSAJE] : " + message);
	}
	
	public void setHolaRef(HolaRef holaRef) {
		this.holaRef =holaRef;
	}
	public HolaRef getHolaRef() {
		return holaRef;
	}
	
	public void setListaPaises(List<String> listaPaises) {
		this.listaPaises =listaPaises;
	}
	public List<String> getListaPaises(){
		return this.listaPaises;
	}
	public void showListaPaises() {
		System.out.println(this.listaPaises);
	}
	
	
	public void setOtroPais(String otroPais) {
		this.otroPais =otroPais;
	}
	public String getOtroPais() {
		return this.otroPais;
	}
}
