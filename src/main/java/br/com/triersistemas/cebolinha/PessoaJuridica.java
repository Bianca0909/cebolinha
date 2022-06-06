package br.com.triersistemas.cebolinha;

import java.util.Random;

public class PessoaJuridica extends Pessoa{
	
	public StringBuilder gerarCnpj() {

		Random r = new Random();

		int n1 = r.nextInt(0, 9);
		int n2 = r.nextInt(0, 9);
		int n3 = r.nextInt(0, 9);
		int n4 = r.nextInt(0, 9);
		int n5 = r.nextInt(0, 9);
		int n6 = r.nextInt(0, 9);
		int n7 = r.nextInt(0, 9);
		int n8 = r.nextInt(0, 9);
		int n9 = 0;
		int n10 = 0;
		int n11 = 0;
		int n12 = r.nextInt(0, 9);

		int num1 = n1 * 5;
		int num2 = n2 * 4;
		int num3 = n3 * 3;
		int num4 = n4 * 2;
		int num5 = n5 * 9;
		int num6 = n6 * 8;
		int num7 = n7 * 7;
		int num8 = n8 * 6;
		int num9 = 0;
		int num10 = 0;
		int num11 = 0;
		int num12 = n12 * 2;

		int resto;
		resto = ((num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10 + num11 + num12) % 11);

		int n13 = resto;
		if (n13 > 9) {
			n13 = 0;
		}

		int resto2;
		resto2 = (((n1 * 5) + (n2 * 4) + (n3 * 3) + (n4 * 2) + (n5 * 9) + (n6 * 8) + (n7 * 7) + (n8 * 6) + (n9 * 5)
				+ (n10 * 4) + (n11 * 3) + (n12 * 2)) % 11);
		int n14 = resto2;
		if (n14 > 9) {
			n14 = 0;
		}
		if (n12 > 4) {
			n12 = 1;
		}

		StringBuilder numeros = new StringBuilder();
		numeros.append(n1).append(n2).append(".").append(n3).append(n4).append(n5).append(".").append(n6).append(n7)
				.append(n8).append("/").append(n9).append(n10).append(n11).append(n12).append("-").append(n13)
				.append(n14);

		numeros.toString();

		if (n1 == n2 && n2 == n3 && n3 == n4 && n4 == n5 && n5 == n6 && n6 == n7 && n7 == n8 && n8 == n9 && n8 == n9 && n10 == n11) {
			System.out.println("CNPJ inválido");
		} else {
			System.out.println("CNPJ válido: Sim");
		}
		return numeros;

	}
}
