package ejercicio04.clases;

import java.util.ArrayList;



public class Vivienda {
	
	private static int contViviendas = 0;
	private int numeroDeVivienda;
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda (String calle, int altura, int piso, String departamento) {
		contViviendas++;
		
		Direccion direccion = new Direccion(calle, altura, piso, departamento);
		
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
		System.out.println("\nVivienda " + numeroDeVivienda + ": \n"
				+ "\nDireccion: " + this.direccion.getDireccion()
				+ "\nPersonas: ");
		
		mostrarPersonas();
		System.out.println("\nMuebles: ");
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
	
	public void vaciarListas() {
		this.personas.clear();
		this.muebles.clear();
	}
	
	public int cantidadDePersonas() {
		return this.personas.size();
	}
	
	public int cantidadDeMuebles() {
		return this.muebles.size();
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
	
	public ArrayList<Persona> getListaPersonas(){
		return personas;
	}
	
	public ArrayList<Mueble> getListaMuebles(){
		return muebles;
	}
	

}
