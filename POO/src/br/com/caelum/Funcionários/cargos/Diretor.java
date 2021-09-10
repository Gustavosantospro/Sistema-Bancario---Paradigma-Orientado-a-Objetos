package br.com.caelum.Funcionários.cargos;

import br.com.caelum.Funcionários.Funcionarios;
import br.com.caelum.Autenticavel;

/**@category: classe extendida de Funcionarios e implementa inteface com métódo Autentica
 * participa da interface: Diretor, Cliente e Gerente.*/

public class Diretor extends Funcionarios implements Autenticavel{

	private int senha;
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean autentica(int senha) 
	{
		if(this.senha != senha)
		{
			return false;
		}
		return true;
	}

}
