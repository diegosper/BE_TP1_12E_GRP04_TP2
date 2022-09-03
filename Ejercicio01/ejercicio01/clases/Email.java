package ejercicio01.clases;

public class Email {
	
	private String cuenta;
	private String dominio;

	
	public Email (String emailCompleto) {
		
		setCuenta(emailCompleto.split("@")[0]);
		setDominio(emailCompleto.split("@")[1]);
		
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
