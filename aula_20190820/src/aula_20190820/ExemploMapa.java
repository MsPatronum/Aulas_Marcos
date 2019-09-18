/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_20190820;

import java.util.*;
public class ExemploMapa {
	static final String[] produtos = {"Laranja", "Melão", "Goiaba"};
	public static void main(String[] args) {
		Map<Integer, Integer> mapa = new HashMap<>();
		mapa.put(0, 5);
		mapa.put(1, 2);
		mapa.put(2, 3);
		System.out.print("O carrinho possui " + mapa.size());
		System.out.println(" produtos");
		Set<Integer> chaves = mapa.keySet();
		for (Integer chave : chaves) {	
			System.out.print("Produto: " + produtos[chave]);
			System.out.println(" Quantidade: " + mapa.get(chave));
		}
                System.out.println("MAPA:" + mapa);
	}
}
