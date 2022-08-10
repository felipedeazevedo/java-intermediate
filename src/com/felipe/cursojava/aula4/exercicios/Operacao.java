package com.felipe.cursojava.aula4.exercicios;

public enum Operacao {

	SOMAR("+") {

		@Override
		public double executaOperacao(double x, double y) {
			return x + y;
		}
		
	}, SUBTRAIR("-") {

		@Override
		public double executaOperacao(double x, double y) {
			return x - y;
		}
		
	}, MULTIPLICAR("*") {

		@Override
		public double executaOperacao(double x, double y) {
			return x * y;
		}
		
	}, DIVIDIR("/") {

		@Override
		public double executaOperacao(double x, double y) {
			return x / y;
		}
		
	};
	
	private String operacao;
	
	Operacao(String operacao) {
		this.operacao = operacao;
	}
	
	public String toString() {
		return this.operacao;
	}
	
	public String getOperacao() {
		return this.operacao;
	}
	
	public abstract double executaOperacao (double x, double y);
}
