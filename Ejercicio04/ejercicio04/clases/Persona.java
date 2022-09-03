package ejercicio04.clases;

public class Persona {

	private String apellido;
	private String nombre;
	private int edad;
	
	public Persona (String Apellido, String nombre, int edad) {
		setApellido(Apellido);
		setEdad(edad);
		setNombre(nombre);
		
	}
	
	protected void mostrarPersona() {
		System.out.println(nombre + " " + apellido + " (" + edad + " años)");
	}

	protected String getApellido() {
		return apellido;
	}

	protected String getNombre() {
		return nombre;
	}

	protected int getEdad() {
		return edad;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}
	
}
