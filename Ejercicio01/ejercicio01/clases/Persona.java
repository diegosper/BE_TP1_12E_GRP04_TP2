package ejercicio01.clases;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList<Email> emails;
	private ArrayList<NumeroTelefonico> telefonos;

	public Persona(String nombre, String apellido) {
		setApellido(apellido);
		setNombre(nombre);
		emails = new ArrayList<Email>();
		telefonos = new ArrayList<NumeroTelefonico>();
	}

	public void agregarEmail(Email email) {
		emails.add(email);
	}

	public void agregarTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTodo() {

		System.out.println("Nombre completo: ");
		System.out.printf("%s, %s%n", this.apellido, this.nombre);
		System.out.println("\nTeléfonos: ");
		for (NumeroTelefonico telefono : telefonos) {
			System.out.println(telefono.getValor());
		}

		System.out.println("\nEmails: ");
		for (Email email : emails) {
			System.out.println(email.getValor());
		}

	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
