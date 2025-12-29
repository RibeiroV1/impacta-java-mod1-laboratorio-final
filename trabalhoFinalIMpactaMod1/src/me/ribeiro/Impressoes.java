package me.ribeiro;

import java.util.ArrayList;

public interface Impressoes {
	
	public default void imprimir(String msg) {
		System.out.println(msg);
	}
	public default void imprimirMensagens(ArrayList<String> lista) {
		for(String mensagem : lista) {
			System.out.println(mensagem);
		}
	}
}
