package br.com.caelum.Funcion�rios.cargos;
import br.com.caelum.Autenticavel;
import br.com.caelum.Funcion�rios.Funcionarios;

public class Gerente extends Funcionarios implements Autenticavel{
	int senha;
	int numFuncionariosGerenciados;
	
	
/**@author Gustavo
 * m�todo obrigat�rio(inteface)*/
	
	public boolean autentica(int senha)
	{
		if (this.senha != senha)
		{
			return false;
		}
		return true;
	}
	
	/** o gerente  recebe bonifica��o igual de funcion�rio + 500,00*/
	
	public double getBonificacao() {
		return getBonificacao() + 500;
	}
	
	/** o sal�rio do gerente � igual ao salario de Funcion�rio + 1500,00.*/
	
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
