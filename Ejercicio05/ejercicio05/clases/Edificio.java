package ejercicio05.clases;

import java.util.ArrayList;

import ejercicio04.clases.*;

public class Edificio {

	private String calle;
	private String altura;
	private ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();
	
	public Edificio(String calle, String altura){
		setCalle(calle);
		setAltura(altura);
	}

	
	public void realizarMudanza(Vivienda origen, Vivienda destino){
		Persona persona;
		for (int i=0; i<origen.cantidadDePersonas(); i++){
			persona = origen.getListaPersonas().get(i);
			destino.agregarPersona(persona);
		}
		
		Mueble mueble;
		for (int j=0; j<origen.cantidadDeMuebles();j++){
			mueble = origen.getListaMuebles().get(j);
			destino.agregarMueble(mueble);
		}

		origen.vaciarListas();	
	}
	
	public void agregarVivienda(Vivienda vivienda){
		
		viviendas.add(vivienda);
	}
	
	
	public void mostrar(){
		Vivienda vivienda;
		for (int i= 0; i<this.cantidadViviendas(); i++){
			//System.out.println("Vivienda " + (i+1) +": ");
			vivienda = this.viviendas.get(i);
			vivienda.mostrarVivienda();
		}			
	}
	
	public String getCalle() {
		return calle;
	}

	public String getAltura() {
		return altura;
	}

	private void setCalle(String calle) {
		this.calle = calle;
	}

	private void setAltura(String altura) {
		this.altura = altura;
	}
	
	private int cantidadViviendas() {
		return this.viviendas.size();
	}
	
	
	
}
