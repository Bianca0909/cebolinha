package br.com.triersistemas.cebolinha;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        
    	Farmaceutico farmaceutico = new Farmaceutico();
    	System.out.println(farmaceutico.getNome());
    	System.out.println(farmaceutico.getOfertaDia());
    	System.out.println(farmaceutico.getDocumento());
    	
    	Fornecedor fornecedor = new Fornecedor();
    	System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.getProdutos());
        System.out.println(fornecedor.getDocumento());
    }
}
