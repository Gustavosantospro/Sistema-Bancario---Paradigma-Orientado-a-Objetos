package Contas;

	public class conta {
		
		//atributos
		private int conta;
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
				
		
		// Contrutores
		public conta(String titular) 
		{
			this.titular = titular;
		}
		public conta() {}
		
		// métodos
		public double depositar(double valorDeposito)
		{
			System.out.println("depósito concluído.");
			saldo = (saldo + valorDeposito);
			return saldo;
		}
		
	
}
