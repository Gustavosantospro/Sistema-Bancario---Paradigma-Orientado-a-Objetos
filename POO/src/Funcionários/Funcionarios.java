package Funcionários;

public class Funcionarios {

	protected String nome;
	protected String cpf;
	protected double salario;
	protected double bonificacao; //todos os funcionários recebem bonificação de 10%, exceto gerente.
	
	//getters
	public String getNome() {return nome;}
	public String getCpf() {return cpf;}
	public double getSalario() {return salario;}
	public double getBonificacao()
	{
		return this.bonificacao = (salario* 0.10);
	}
	
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
	
}
