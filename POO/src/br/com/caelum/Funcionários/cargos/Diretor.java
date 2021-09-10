package br.com.caelum.Funcion�rios.cargos;

import br.com.caelum.Funcion�rios.Funcionarios;
import br.com.caelum.Autenticavel;

/**@category: classe extendida de Funcionarios e implementa inteface com m�t�do Autentica
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
