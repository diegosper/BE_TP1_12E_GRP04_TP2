package ejercicio02.test;

import ejercicio02.clases.Mascota;
import ejercicio01.clases.*;


public class Test {

	public static void main(String[] args) {
		NumeroTelefonico tel1 = new NumeroTelefonico(54, 911, 68765620, TipoLineaEnum.CELULAR);
		NumeroTelefonico tel2 = new NumeroTelefonico(34, 611, 108592, TipoLineaEnum.FIJO);
		NumeroTelefonico tel3 = new NumeroTelefonico(1, 9, 555444, TipoLineaEnum.CELULAR);
		
		Mascota masc1 = new Mascota("Iker", "Perro");
		Mascota masc2 = new Mascota("Flor", "Gatos");
		
		Persona p = new Persona("Diego", "Sperber");
		
		//Mails por composición
		p.agregarEmail("kevin.sper@midominio.com");
		p.agregarEmail("laieta@gmail.com");
		p.agregarEmail("diego.sper@hotmail.com");
		
		//Mails por agregación
		p.agregarTelefono(tel1);
		p.agregarTelefono(tel2);
		p.agregarTelefono(tel3);
		
		//Mascotas por agregación
		p.agregarMascota(masc1);
		p.agregarMascota(masc2);
		
		p.mostrarTodo();
		
	}

}
