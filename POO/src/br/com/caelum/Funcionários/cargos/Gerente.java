package br.com.caelum.Funcionários.cargos;
import br.com.caelum.Autenticavel;
import br.com.caelum.Funcionários.Funcionarios;

public class Gerente extends Funcionarios implements Autenticavel{
	int senha;
	int numFuncionariosGerenciados;
	
	
/**@author Gustavo
 * método obrigatório(inteface)*/
	
	public boolean autentica(int senha)
	{
		if (this.senha != senha)
		{
			return false;
		}
		return true;
	}
	
	/** o gerente  recebe bonificação igual de funcionário + 500,00*/
	
	public double getBonificacao() {
		return getBonificacao() + 500;
	}
	
	/** o salário do gerente é igual ao salario de Funcionário + 1500,00.*/
	
	public double getSalario(){
		salario = salario + 1500;
		return salario;
	}
@Override
	public double getGastos() {
	
		return getSalario() + getBonificacao();
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo();
	}
}
