package ejercicio03.test;

import ejercicio01.clases.*;
import ejercicio02.clases.*;
import ejercicio03.clases.Persona;

public class Test {

	public static void main(String[] args) {
		NumeroTelefonico tel1 = new NumeroTelefonico(54, 911, 68765620, TipoLineaEnum.CELULAR);
		NumeroTelefonico tel2 = new NumeroTelefonico(34, 611, 108592, TipoLineaEnum.FIJO);
		NumeroTelefonico tel3 = new NumeroTelefonico(1, 9, 555444, TipoLineaEnum.CELULAR);
		
		Email email1 = new Email ("kevin.sper@midominio.com");
		Email email2 = new Email ("laieta@gmail.com");
		Email email3 = new Email ("diego.sper@hotmail.com");
		
		Mascota masc1 = new Mascota("Iker", "Perro");
		Mascota masc2 = new Mascota("Flor", "Gatos");
		
		Persona p = new Persona("Diego", "Sperber");
		
		p.agregarEmail(email1);
		p.agregarEmail(email2);
		p.agregarEmail(email3);
		
		p.agregarTelefono(tel1);
		p.agregarTelefono(tel2);
		p.agregarTelefono(tel3);
		
		p.agregarMascota(masc1);
		p.agregarMascota(masc2);
		
		p.mostrarTodo();
		
	}

}
