package br.com.triersistemas.cebolinha;

import java.util.Random;

public class PessoaFisica extends Pessoa{
	String documento;

	public StringBuilder gerarCpf() {

		Random r = new Random();

		int n1 = r.nextInt(0, 9);
		int n2 = r.nextInt(0, 9);
		int n3 = r.nextInt(0, 9);
		int n4 = r.nextInt(0, 9);
		int n5 = r.nextInt(0, 9);
		int n6 = r.nextInt(0, 9);
		int n7 = r.nextInt(0, 9);
		int n8 = r.nextInt(0, 9);
		int n9 = r.nextInt(0, 9);

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
		resto2 = (((n1 * 0) + (n2 * 1) + (n3 * 2) + (n4 * 3) + (n5 * 4) + (n6 * 5) + (n7 * 6) + (n8 * 7) + (n9 * 8)
				+ (n10 * 9)) % 11);
		int n11 = resto2;
		if (n11 > 9) {
			n11 = 0;
		}

		StringBuilder numeros = new StringBuilder();
		numeros.append(n1).append(n2).append(n3).append(".").append(n4).append(n5).append(n6).append(".").append(n7)
				.append(n8).append(n9).append("-").append(n10).append(n11);

		numeros.toString();
		
		 if (n1 == n2 && n2 == n3 && n3 == n4 && n4 == n5 && n5 == n6 && n6 == n7 && n7 == n8 && n8 == n9 && n8 == n9 && n9 == n10 && n10 == n11) {
			System.out.println("CPF inválido");
		 } else {
			 System.out.println("CPF válido: Sim");
		 }
		return numeros;
 
	}

	public String getDocumento() {
		return documento;
	}
}
