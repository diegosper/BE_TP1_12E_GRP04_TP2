package ejercicio03.test;

import ejercicio01.clases.*;
import ejercicio02.clases.*;
import ejercicio03.clases.*;

public class Test {

	public static void main(String[] args) {
		NumeroTelefonico tel1 = new NumeroTelefonico(54, 911, 68765620, TipoLineaEnum.CELULAR);
		NumeroTelefonico tel2 = new NumeroTelefonico(34, 611, 108592, TipoLineaEnum.FIJO);
		NumeroTelefonico tel3 = new NumeroTelefonico(1, 9, 555444, TipoLineaEnum.CELULAR);
		
		Mascota masc1 = new Mascota("Iker", "Perro");
		Mascota masc2 = new Mascota("Flor", "Gatos");
		
		Persona p = new Persona("Diego", "Sperber");
		Persona p2 = new Persona("Laia", "Jeba");
		
		//Mails por composición
		p.agregarEmail("kevin.sper@midominio.com");
		p2.agregarEmail("laieta@gmail.com");
		p.agregarEmail("diego.sper@hotmail.com");
		
		//Mails por agregación
		p.agregarTelefono(tel1);
		p.agregarTelefono(tel2);
		p2.agregarTelefono(tel3);
		
		//Mascotas por agregación
		p.agregarMascota(masc1);
		p.agregarMascota(masc2);
		
		Hito hito = new Hito("20/12/2016", "Casamiento");
		hito.agregarPersona(p);
		hito.agregarPersona(p2);
		
		hito.mostrarTodo();	
		
	}

}
