package br.com.triersistemas.cebolinha;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class PessoaFisica extends Pessoa {
	String documento;

	public void gerarCpf() {
		
		Random r = new Random();

		int n1 = r.nextInt(0,9);
		int n2 = r.nextInt(0,9);
		int n3 = r.nextInt(0,9);
		int n4 = r.nextInt(0,9);
		int n5 = r.nextInt(0,9);
		int n6 = r.nextInt(0,9);
		int n7 = r.nextInt(0,9);
		int n8 = r.nextInt(0,9);
		int n9 = r.nextInt(0,9);

		
		int num1 = n1 * 0;
		int num2 = n2 * 1;
		int num3 = n3 * 2;
		int num4 = n4 * 3;
		int num5 = n5 * 4;
		int num6 = n6 * 5;
		int num7 = n7 * 6;
		int num8 = n8 * 7;
		int num9 = n9 * 8;

		int resto;
		resto = ((num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9) % 11);
		
		int n10 = resto;
		if (n10 > 9) {
			n10 = 0;
		}
		

		int resto2;
		resto2 = (((n1 * 0) + (n2 * 1) + (n3 * 2) + (n4 * 3) + (n5 * 4) + (n6 * 5) + (n7 * 6) + (n8 * 7) + (n9 * 8) + (n10 * 9)) % 11);
		int n11 = resto2;
		if (n11 > 9) {
			n11 = 0;
		}
		// Stringformat ou Stringbuilder;
		
		StringBuilder numeros = new StringBuilder();
	    numeros.append(n1).append(n2).append("José>").append("Renata");

	  System.out.println(numeros.toString());

	}

}
