package ejercicio04.clases;

public class Mueble {

	private String tipo;
	private String material;
	private String color;
	
	
	public Mueble (String tipo, String material, String color) {
		setColor(color);
		setMaterial(material);
		setTipo(tipo);

	}
	
	protected void mostrarMueble () {
		System.out.println(tipo + " de " + material + ", color " + color);
	}
	
	
	protected String getTipo() {
		return tipo;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	protected String getColor() {
		return color;
	}
	private void setColor(String color) {
		this.color = color;
	}


	protected String getMaterial() {
		return material;
	}


	private void setMaterial(String material) {
		this.material = material;
	}
	
}
