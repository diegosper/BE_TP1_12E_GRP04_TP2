package ejercicio01.clases;

import java.util.ArrayList;

import ejercicio02.clases.Mascota;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList<Email> emails;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Mascota> mascotas;

	public Persona(String nombre, String apellido) {
		setApellido(apellido);
		setNombre(nombre);
		emails = new ArrayList<Email>();
		telefonos = new ArrayList<NumeroTelefonico>();
		mascotas = new ArrayList<Mascota>();
	}

	public void agregarEmail(String emailCompleto) {
		Email email = new Email (emailCompleto);
		emails.add(email);
	}

	public void agregarTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
	}

	public void agregarMascota (Mascota mascota) {
		mascotas.add(mascota);
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
		
		System.out.println("\nMascotas: ");
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getValor());
		}

	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
