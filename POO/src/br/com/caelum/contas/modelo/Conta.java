package br.com.caelum.contas.modelo;

	public abstract class Conta {
		
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
		private int numero;
		protected double saldo;
		private static int totalDeContas;
		
		// getters
		public int getConta() {return conta;}
		public String getTitular() {return titular;}
		public double getSaldo() {return saldo;}
		public static int getTotalDeContas() {return totalDeContas;}
		
		//setters
		public void setConta(int conta)
		{this.conta = conta;}
		public void setAgencia(String Agencia) {this.Agencia = Agencia;}
		public void setTitular(String titular) {this.titular = titular;}
		public void setNumero(int numero) {this.numero = numero;}
		public void setSaldo(double saldo) {this.saldo = saldo;}
		
		
				
		
		// métodos
		
		/**
		 * Método abstrato  da classe Conta que incrementa o saldo
		 * @param valorDeposito
		 * */
		public abstract void depositar(double valorDeposito);
		
		public void saca(double valorDigitado) {
			saldo =- valorDigitado;    
			
			
		}
		
	
}
