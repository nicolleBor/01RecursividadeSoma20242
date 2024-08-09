package controller;

public class RecursivaSomaController {

	public RecursivaSomaController() {
		super();
	}
	
	public int soma(int n) {
		//Condição de parada
		if (n == -1) {
			return 0;
		} else {
			return n + soma(n-1); //Chamada da função
		}
	}

}
