package com.felipe.cursojava.aula4.exercicios;

public class Teste {

	public static void main(String[] args) {
		
		double x = 2.0;
		double y = 3.0;
		
		for (Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executaOperacao(x, y));
		}
	}

}
