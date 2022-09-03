package ejercicio04.clases;

public class Direccion {

	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	
	public Direccion (String calle, int altura, int piso, String departamente) {
		setAltura(altura);
		setCalle(calle);
		setDepartamento(departamente);
		setPiso(piso);
		
	}
	
	protected String getDireccion () {
		return calle + " " + altura + " " + piso + "º \"" + departamento + "\"\n";
	}
	
	
	

	protected String getCalle() {
		return calle;
	}

	protected int getAltura() {
		return altura;
	}

	protected int getPiso() {
		return piso;
	}

	protected String getDepartamento() {
		return departamento;
	}

	private void setCalle(String calle) {
		this.calle = calle;
	}

	private void setAltura(int altura) {
		this.altura = altura;
	}

	private void setPiso(int piso) {
		this.piso = piso;
	}

	private void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
