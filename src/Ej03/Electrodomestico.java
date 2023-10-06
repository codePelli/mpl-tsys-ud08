package Ej03;

public class Electrodomestico {
	
	public int precioBase;
	public String color;
	public String consumo;
	public int peso;

	public Electrodomestico() {
	
		this.precioBase = 100;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = 5;
	
	}
	
	public Electrodomestico(int precioBase, String color, String consumo, int peso) {
	
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
 
	Electrodomestico defecto = new Electrodomestico();
	Electrodomestico marc = new Electrodomestico(150, "negro", "F", 200);

	public void selColor(String colorin) {
	 
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean condicion = false;
	 
		for (int x = 0; x < colores.length; x++) {
		 
			if (colores[x].equalsIgnoreCase(colorin)) {
				condicion = true;
				break;
			}
		 
		}
	 
		if (condicion) {
			this.color = colorin;
		}
	 
	}
 
}
