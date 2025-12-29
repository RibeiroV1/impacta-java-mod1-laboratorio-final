package me.ribeiro;

public class RG {
	
	private int numero;
	private String dataNasc;
	
	public RG(int numeroRG, String dataNasc) {
		this.numero = numeroRG;
		this.dataNasc = dataNasc;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
