package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends PessoaJuridica{
	private List<String> produtos;

	public List<String> getProdutos() {
		return produtos;
	}

	public Fornecedor() {

		List<String> lista = new ArrayList<>();
		lista.add("Dramin");
		lista.add("Paracetamol");
		lista.add("Neosoro");
		this.produtos = lista;

	}
}
