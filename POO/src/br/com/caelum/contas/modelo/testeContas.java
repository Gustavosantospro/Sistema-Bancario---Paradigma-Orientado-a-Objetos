package br.com.caelum.contas.modelo;

public class testeContas {

	public static void main(String[] args) {
		ContaCorrente contaNormal = new ContaCorrente();
		
		contaNormal.setSaldo(1000);
		System.out.println(contaNormal.getValorImposto());

		
		
	}
}
