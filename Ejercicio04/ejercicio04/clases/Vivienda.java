package ejercicio04.clases;

import java.util.ArrayList;


public class Vivienda {
	
	private static int contViviendas = 0;
	private int numeroDeVivienda;
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda (Direccion direccion) {
		contViviendas++;
		
		setDireccion(direccion);
		setNumeroDeVivienda(contViviendas);
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
		
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void agregarMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}
	
	
	
	
	public void mostrarVivienda() {
		System.out.println("Vivienda " + numeroDeVivienda + ": \n\n"
				+ "Direccion: " + this.direccion.getDireccion()
				+ "Personas: ");
		
		mostrarPersonas();
		System.out.println("Muebles: ");
		mostrarMuebles();
	}
	
	public void mostrarPersonas() {
		for (Persona persona : personas) {
			persona.mostrarPersona();
		}
	}

	public void mostrarMuebles() {
		for (Mueble mueble : muebles) {
			mueble.mostrarMueble();
		}
	}
	
	public Direccion getDireccion() {
		return direccion;
	}

	private void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getNumeroDeVivienda() {
		return numeroDeVivienda;
	}

	private void setNumeroDeVivienda(int numeroDeVivienda) {
		this.numeroDeVivienda = numeroDeVivienda;
	}
	
	

}
