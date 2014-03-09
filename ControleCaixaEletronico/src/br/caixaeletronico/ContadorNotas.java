package br.caixaeletronico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorNotas {
	
	private Map<Nota, Integer> contador;
	
	public ContadorNotas(){
		this.contador = new HashMap<Nota, Integer>();
		
		for (Nota nota : Nota.values()) {
			contador.put(nota, 0);
		}
	}
	
	public void addNota(Nota nota, int quantidade) {
		contador.put(nota, quantidade);
	}

	private List<Integer> getQuantidadesComoList() {
		List<Integer> quantidades = new ArrayList<Integer>();
		
		for(Integer quantidade: this.contador.values()) {
			quantidades.add(quantidade);
		}
		
		return quantidades;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass() == ContadorNotas.class) return this.equals((ContadorNotas) obj);
		return false;
	}
	
	private boolean equals(ContadorNotas contador) {
		return this.quantidadesIguais(contador);
	}

	private boolean quantidadesIguais(ContadorNotas contador) {
		List<Integer> quantidades = this.getQuantidadesComoList();
		List<Integer> quantidadesContador = contador.getQuantidadesComoList();
		
		for (int i = 0; i < quantidades.size(); i++) {
			if(quantidades.get(i).intValue() != quantidadesContador.get(i).intValue()){
				return false;
			}
		}
		
		return true;
	}

	@Override
	public String toString() {
		return this.contador.toString();
	}
}
