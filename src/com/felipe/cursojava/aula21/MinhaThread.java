package com.felipe.cursojava.aula21;

public class MinhaThread implements Runnable {
	
	private String nome;
	
	public MinhaThread(String nome) {
		this.nome = nome;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
