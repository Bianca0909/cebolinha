package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Pessoa {
	private String nome;
	private String documento;

	public Pessoa() {
		List<String> nomes = new ArrayList<>();
		nomes.add("Bianca");
		nomes.add("Vitória");
		nomes.add("Caethana");
		nomes.add("Kay");
		nomes.add("Amanda");
		nomes.add("Carol");
		nomes.add("Antonio");
		nomes.add("Edymar");
		nomes.add("Davi");
		nomes.add("Igor");
		nomes.add("Edward");

		SplittableRandom r = new SplittableRandom();
		this.nome = nomes.get(r.nextInt(0, nomes.size()));
	}

	public String getNome() {
		return nome;
	}

	public String getDocumento() {
		return documento;
	}
}
