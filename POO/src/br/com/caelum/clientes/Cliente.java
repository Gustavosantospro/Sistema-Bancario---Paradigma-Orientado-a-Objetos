package br.com.caelum.clientes;
import br.com.caelum.Autenticavel;;

public class Cliente implements Autenticavel{

	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha != senha)
		{
			return false;
		}
		else {return true;}
	}
	
}
