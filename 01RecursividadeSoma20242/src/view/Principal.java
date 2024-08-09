package view;

import controller.RecursivaSomaController;

public class Principal {

	public static void main(String[] args) {
		RecursivaSomaController somaController = new RecursivaSomaController();
		int n = 10;
		int resultado = somaController.soma(n);
		System.out.println(resultado);
	}

}
