package ejercicio01.clases;

public class NumeroTelefonico {
	
	private int característica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoLineaEnum tipoLinea;
	
	public NumeroTelefonico (int codigoDePais, int caracteristica, int numeroDeAbonado, TipoLineaEnum tipoLinea) {
		
		setCaracterística(caracteristica);
		setCodigoDePais(codigoDePais);
		setNumeroDeAbonado(numeroDeAbonado);
		setTipoLinea(tipoLinea);
		
		
	}
	
	public String getValor() {
				
		return String.format("%s: (+%s) %s-%s", this.tipoLinea.toString(), this.codigoDePais, this.característica, this.numeroDeAbonado);
	}
	

	private void setCaracterística(int característica) {
		this.característica = característica;
	}

	private void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	private void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	private void setTipoLinea(TipoLineaEnum tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
	
	

}
