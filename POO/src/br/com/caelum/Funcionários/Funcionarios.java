package br.com.caelum.Funcion�rios;

public abstract class Funcionarios {

	protected String nome;
	protected String cpf;
	protected double salario;
	protected double bonificacao; //todos os funcion�rios recebem bonifica��o de 10%, exceto gerente.
	
	//getters
	public String getNome() {return nome;}
	public String getCpf() {return cpf;}
	public double getSalario() {return salario;}
	
	// setters
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// m�todos
	public double getGastos()
	{
		return salario;
	}
	
	public String getInfo()
	{
		return ("nome:" + nome + "\nrecebe:" + salario);
	}
	/**@param: m�todo abstrato*/
	public abstract double getBonificacao();
	
}
