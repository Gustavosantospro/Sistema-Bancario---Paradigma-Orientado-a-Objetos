package Funcionários.bonificacoes;
import Funcionários.Funcionarios;

public class controleBonificacao {
	private double totalBonificacoes = 0;
	
	public void registra(Funcionarios funcionario)
	{
		totalBonificacoes = totalBonificacoes + funcionario.getBonificacao();
	}
	
	public double getTotalBonificacoes()
	{
		return this.totalBonificacoes;
	}
}
