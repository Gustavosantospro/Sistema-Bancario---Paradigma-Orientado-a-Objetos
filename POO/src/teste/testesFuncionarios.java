package teste;

import Funcion�rios.Funcionarios;
import Funcion�rios.bonificacoes.controleBonificacao;
import Funcion�rios.cargos.gerente;
import teste.GeradorRelatorio;


public class testesFuncionarios {

	public static void main (String[] args) {
		Funcionarios nw = new Funcionarios();
		controleBonificacao controle = new controleBonificacao();
		
		nw.setSalario(1000);
		
		/* estanciando um objeto do tipo gerente*/
		
		gerente gerente1 = new gerente();
		gerente1.setSalario(nw.getSalario());
		gerente gerente2 = new gerente();
		
		/* passando gerente1 como par�metro, numa fun��o(registra();) que originalmente recebe 
		uma refer�ncia a um objeto do tipo Funcionario*/
		controle.registra(gerente1);
		
		System.out.println(adiciona(gerente2));
		System.out.println(gerente1.getSalario());
		System.out.println(controle.getTotalBonificacoes());
	}

	
}
