package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica {
	private String ofertaDia;

	public String getOfertaDia() {
		return ofertaDia;
	}

	public Farmaceutico() {
		List<String> ofertas = new ArrayList<>();
		ofertas.add("Dramin R$ 15,90");
		ofertas.add("Paracetamol: R$ 5,99");
		ofertas.add("Neosoro: R$ 2,99");
		SplittableRandom r = new SplittableRandom();
		this.ofertaDia = ofertas.get(r.nextInt(0, ofertas.size()));
	}

}
