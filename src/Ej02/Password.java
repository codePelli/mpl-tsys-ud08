package Ej02;

public class Password {
	
	int longitud = 8;
	String contrasena;



 public Password() {
	
	this.longitud = 8;
	this.contrasena = "";
	
 }
 
 public Password(int longitud, String contrasena) {
	 
	 this.longitud = longitud;
	 this.contrasena = contrasena;
	 
 }
 
 Password defecto = new Password();
 Password marc = new Password(10, "aaasssdddf");
	
}
