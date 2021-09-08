package br.com.caelum.Funcionários;

public abstract class Funcionarios {

	protected String nome;
	protected String cpf;
	protected double salario;
	protected double bonificacao; //todos os funcionários recebem bonificação de 10%, exceto gerente.
	
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
	
	// métodos
	public double getGastos()
	{
		return salario;
	}
	
	public String getInfo()
	{
		return ("nome:" + nome + "\nrecebe:" + salario);
	}
	/**@param: método abstrato*/
	public abstract double getBonificacao();
	
}
