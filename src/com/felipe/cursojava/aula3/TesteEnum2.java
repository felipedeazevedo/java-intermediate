package com.felipe.cursojava.aula3;

import com.felipe.cursojava.aula1.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);
	}

}
