package ejercicio03.clases;

import java.util.ArrayList;

import ejercicio01.clases.*;

public class Hito {

	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito (String fecha, String descripcion){
		setFecha(fecha);
		setDescripcion(descripcion);		
		personasInvolucradas = new ArrayList<Persona>();
	}
	
	
	public void agregarPersona (Persona persona) {
		personasInvolucradas.add(persona);
	}
	
	public void mostrarTodo(){
		System.out.println("Fecha: " + getFecha());
		System.out.println("Descripcion: " + getDescripcion());
		
		for(int i=0; i<personasInvolucradas.size(); i++){
			personasInvolucradas.get(i).mostrarTodo();
		}		
	}	
	
	

	public String getFecha() {
		return fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	private void setFecha(String fecha) {
		this.fecha = fecha;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
