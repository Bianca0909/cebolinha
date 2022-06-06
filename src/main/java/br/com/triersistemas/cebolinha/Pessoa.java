package br.com.triersistemas.cebolinha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;

public abstract class Pessoa {
	private String nome;
	private LocalDate niver;

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
		this.niver = LocalDate.now();
	}

	protected Pessoa(final String nome, final LocalDate niver) {
		this.nome = nome;
		this.niver = niver;
	}

	public String getNome() {
		return nome;
	}

	public Long getIdade() {
		return Objects.nonNull(niver) ? ChronoUnit.YEARS.between(niver, LocalDate.now()) : 0;
	}

}
