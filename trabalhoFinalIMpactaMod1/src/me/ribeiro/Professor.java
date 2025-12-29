package me.ribeiro;

import java.util.ArrayList;

public class Professor extends Pessoa implements Impressoes{

	private float salario;
	private String diciplina;
	
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String diciplina) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.salario = salario;
		this.diciplina = diciplina;
	}
	
	@Override
	public void falar(String fala) {
		imprimir(getNome() + ": " +fala);
	}
	@Override
	public void mostrarDados() {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Professor " + getNome());
		arr.add("Diciplina: " + getDiciplina());
		arr.add("Idade: " + getIdade());
		arr.add("Sexo: " + getSexo());
		arr.add("Numero RG: " + getRg().getNumero());
		arr.add("Data de Nascimento: "+ getRg().getDataNasc());
		imprimirMensagens(arr);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	

}
