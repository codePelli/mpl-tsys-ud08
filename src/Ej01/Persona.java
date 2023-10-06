package Ej01;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private int peso;
	private int altura;
	
	public Persona() {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
		
	}
 
	public Persona(String nombre, int edad, String dni, String sexo, int peso, int altura) {
	 
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	 
	}
 
	Persona defecto = new Persona();
	Persona marc = new Persona("Marc", 31, "", "H", peso, altura);
	Persona todos = new Persona("Marci", 31, "12312311Y", "D", 60, 170);
	
}	
