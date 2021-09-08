package br.com.caelum.Funcionários.bonificacoes;
import br.com.caelum.Funcionários.Funcionarios;

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
