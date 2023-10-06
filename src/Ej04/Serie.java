package Ej04;

public class Serie {
	
	public String titulo;
	public int temporadas;
	public boolean entregado;
	public String genero;
	public String creador;
	
	public Serie() {
		
		this.titulo = titulo;
		this.temporadas  = 3;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
		
	}
	
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	Serie defecto = new Serie();
	Serie marc = new Serie("Dark", temporadas, entregado, genero, "Random");
	Serie marci = new Serie("Dark", 5, entregado, "Drama", "Random");

}


