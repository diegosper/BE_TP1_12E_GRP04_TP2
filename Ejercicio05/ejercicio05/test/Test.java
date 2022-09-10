package ejercicio05.test;

import ejercicio05.clases.*;
import ejercicio04.clases.*;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edificio edificio = new Edificio ("Balcarce", "32");
		
		//CREO VIVIENDA PARA PROBAR EN MAIN
		Vivienda vivienda = new Vivienda ("Balcarce", 32, 5, "A");
		Vivienda vivienda2 = new Vivienda ("Balcarce", 32, 15, "D");
		
		//CREO PERSONAS PARA PROBAR EN MAIN
		Persona persona1 = new Persona ("Sperber", "Diego", 28);
		Persona persona2 = new Persona ("Picapiedras", "Pedro", 31);
		
		
		
		//CREO MUEBLES PARA PROBAR EN MAIN
		Mueble mueble1 = new Mueble ("Mesa", "madera", "Marrón");
		Mueble mueble2 = new Mueble ("Mesa", "mármol", "Rojo");
		Mueble mueble3 = new Mueble ("Perchero", "metal", "Negro");
		Mueble mueble4 = new Mueble ("Sillón", "cuero", "Azul");
		
		//COMPLETO VIVIENDA
		vivienda.agregarPersona(persona1);
		vivienda.agregarPersona(persona2);
		
		vivienda.agregarMueble(mueble1);
		vivienda.agregarMueble(mueble2);
		vivienda.agregarMueble(mueble3);
		vivienda.agregarMueble(mueble4);
		
		edificio.agregarVivienda(vivienda);
		edificio.agregarVivienda(vivienda2);
		
		//EJECUTO PROGRAMA HARCODEADO
		//vivienda.mostrarVivienda();
		edificio.mostrar();
		
		
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
		edificio.realizarMudanza(vivienda, vivienda2);
		edificio.mostrar();
	}

		
	

}