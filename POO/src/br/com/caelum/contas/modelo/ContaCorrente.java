package br.com.caelum.contas.modelo;


public class ContaCorrente extends Conta implements Tributavel{

	
	public void depositar(double valorDeposito) {
		double saldo = getSaldo();
		saldo = saldo + valorDeposito;
		System.out.println("valor depositado com sucesso!");
	}

	public double getValorImposto() {
		double saldo = getSaldo();
		double valorImposto = saldo*1.01;
				
		return valorImposto;
	}


}
