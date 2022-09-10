package ejercicio01.clases;

public class Email {
	
	private String cuenta;
	private String dominio;

	
	public Email (String emailCompleto) {
		String[] mail = emailCompleto.split("@");
		setCuenta(mail[0]);
		setDominio(mail[1]);
		
	}

	
	public String getValor () {
		
		return String.format("%s@%s", this.cuenta, this.dominio);
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	
	
	
}
