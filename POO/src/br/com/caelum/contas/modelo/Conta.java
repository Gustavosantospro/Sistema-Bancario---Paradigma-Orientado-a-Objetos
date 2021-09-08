package br.com.caelum.contas.modelo;

	public class Conta {
		
		/**
		 * Classe resposável por moldar as contas do banco
		 * @author Gustavo Vieira dos Santos
		 * @category Contas
		 * @since 01/09/2021
		 * */
		
		//atributos
		private int conta;
		public String Agencia;
		private String titular;
		public int numero;
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
		public void setAgencia(String Agencia) {this.Agencia = Agencia;}
		public void setTitular(String titular) {this.titular = titular;}
		public void setNumero(int numero) {this.numero = numero;}
		
				
		
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
		public void depositar(double valorDeposito)
		{
			
			saldo = (saldo + valorDeposito);
			
		}
		public void saca(double valorDigitado) {
			saldo =- valorDigitado;    
			
			
		}
		
	
}
