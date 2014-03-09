package br.caixaeletronico;

public enum Nota {
	
	CEM {
		@Override
		int getValor() {
			return 100;
		}
	},
	CINQUENTA {
		@Override
		int getValor() {
			return 50;
		}
	},
	VINTE {
		@Override
		int getValor() {
			return 20;
		}
	},
	DEZ {
		@Override
		int getValor() {
			return 10;
		}
	};
	
	
	abstract int getValor();
}
