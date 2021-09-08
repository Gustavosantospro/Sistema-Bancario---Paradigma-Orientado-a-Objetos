package teste;

import Funcionários.Funcionarios;
import Funcionários.bonificacoes.controleBonificacao;
import Funcionários.cargos.gerente;

public class testesFuncionarios {

	public static void main (String[] args) {
		Funcionarios nw = new Funcionarios();
		controleBonificacao controle = new controleBonificacao();
		
		nw.setSalario(1000);
		
		/** estanciando um objeto do tipo gerente*/
		
		gerente gerente1 = new gerente();
		gerente1.setSalario(nw.getSalario());
		controle.registra(gerente1);
		
		
		
		
				
		
		System.out.println(gerente1.getSalario());
		System.out.println(controle.getTotalBonificacoes());
	}

	
}
