package br.com.triersistemas.cebolinha;

import java.util.Random;

public abstract class PessoaFisica extends Pessoa {
	String documento;

	public String gerarCpf() {
		Random r = new Random();

		int n1 = r.nextInt();
		int n2 = r.nextInt();
		int n3 = r.nextInt();
		int n4 = r.nextInt();
		int n5 = r.nextInt();
		int n6 = r.nextInt();
		int n7 = r.nextInt();
		int n8 = r.nextInt();
		int n9 = r.nextInt();

		n1 = n1 * 0;
		n2 = n2 * 1;
		n3 = n3 * 2;
		n4 = n4 * 3;
		n5 = n5 * 4;
		n6 = n6 * 5;
		n7 = n7 * 6;
		n8 = n8 * 7;
		n9 = n9 * 8;
		 
		int resto;
		resto = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) % 11; 
      if (resto > 9) {
    	  resto = 0;
      }
		int n10 = resto;
      
       int resto2;
       resto2 = ((n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8+ n9+ n10 + (n10*9)) % 11);
       if (resto2 > 9) {
     	  resto = 0;
       }
       int n11 = resto2;
       
       return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 +  "";
       
	}

}
