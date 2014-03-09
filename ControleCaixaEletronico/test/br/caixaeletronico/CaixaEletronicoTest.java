package br.caixaeletronico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaixaEletronicoTest {

	private CaixaEletronico caixaEletronico;

	@Before
	public void antesDeRodarOsTestesInicializarCaixaEletronico() {
		this.caixaEletronico = new CaixaEletronico();
	}
	
	@Test
	public void sacar30ReaisDeverVir1NotaDe20E1NotaDe10() {
		ContadorNotas contadorExperado = new ContadorNotas();
		contadorExperado.addNota(Nota.DEZ, 1);
		contadorExperado.addNota(Nota.VINTE, 1);
		
		ContadorNotas contatorNotas = this.caixaEletronico.sacar(30);
		assertEquals(contadorExperado, contatorNotas);
	}
	
	@Test
	public void sacar80ReaisDeveVir1NotaDe501NotaDe20E1NotaDe10(){
		ContadorNotas contadorExperado = new ContadorNotas();
		contadorExperado.addNota(Nota.DEZ, 1);
		contadorExperado.addNota(Nota.VINTE, 1);
		contadorExperado.addNota(Nota.CINQUENTA, 1);
		
		ContadorNotas contatorNotas = this.caixaEletronico.sacar(80);
		assertEquals(contadorExperado, contatorNotas);
	}
	
	@Test
	public void sacar200ReaisDeveVir2NotasDe100(){
		ContadorNotas contadorExperado = new ContadorNotas();
		contadorExperado.addNota(Nota.CEM, 2);
		
		ContadorNotas contatorNotas = this.caixaEletronico.sacar(200);
		assertEquals(contadorExperado, contatorNotas);
	}
	
	@Test
	public void sacar1030ReaisDeveVir10NotasDe100E1NotaDe20E1NotaDe10(){
		ContadorNotas contadorExperado = new ContadorNotas();
		contadorExperado.addNota(Nota.CEM, 10);
		contadorExperado.addNota(Nota.DEZ, 1);
		contadorExperado.addNota(Nota.VINTE, 1);
		
		ContadorNotas contatorNotas = this.caixaEletronico.sacar(1030);
		assertEquals(contadorExperado, contatorNotas);
	}
}
