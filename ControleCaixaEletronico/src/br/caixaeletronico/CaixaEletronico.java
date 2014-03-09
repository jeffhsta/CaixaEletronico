package br.caixaeletronico;

public class CaixaEletronico {
	
	public ContadorNotas sacar(int valor) {
		ContadorNotas contador = new ContadorNotas();
		
		for (Nota nota : Nota.values()) {
			if (valor >= nota.getValor()){
				contador.addNota(nota, valor / nota.getValor());
				valor = valor % nota.getValor();
			}
		}
		
		return contador;
	}

}
