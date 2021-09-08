package br.com.caelum.Funcionários.cargos;
import br.com.caelum.Funcionários.Funcionarios;

public class gerente extends Funcionarios{
	int senha;
	int numFuncionariosGerenciados;
	
	

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
