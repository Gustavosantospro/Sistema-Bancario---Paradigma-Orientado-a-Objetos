package br.com.caelum.contas;

	public class Conta {
		
		/**
		 * Classe resposável por moldar as contas do banco
		 * @author Gustavo Vieira dos Santos
		 * @category Contas
		 * @since 01/09/2021
		 * */
		
		//atributos
		private int conta;
		private String Agencia;
		private String titular;
		private double saldo;
		private static int totalDeContas;
		
		// getters
		public int getConta() {return conta;}
		public String getTitular() {return titular;}
		public double getSaldo() {return saldo;}
		public static int getTotalDeContas() {return totalDeContas;}
		
		//setters
		public void setConta(int conta)
		{this.conta = conta;}
		public void setAgencia(String Agencia) {
			this.Agencia = Agencia;
		}
				
		
		// Contrutores
		public Conta(String titular) 
		{
			this.titular = titular;
		}
		public Conta() {}
		
		// métodos
		
		/**
		 * Método que incrementa o saldo
		 * @param valorDeposito
		 * */
		public double depositar(double valorDeposito)
		{
			System.out.println("depósito concluído.");
			saldo = (saldo + valorDeposito);
			return saldo;
		}
		
	
}
