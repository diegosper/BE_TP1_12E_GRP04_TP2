package ejercicio02.clases;

public class Mascota {
	
	private String nombre;
	private String tipo;
	
	
	public Mascota (String nombre, String tipo) {
		setNombre(nombre);
		setTipo(tipo);
	}
	
	
	public String getValor() {
		return String.format("%s, %s", this.tipo, this.nombre);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
