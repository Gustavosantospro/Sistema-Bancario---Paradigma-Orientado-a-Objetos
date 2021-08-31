package Contas;


public class contaMain {
	
	public static void main(String[] args)
	{
		conta c = new conta("Pedro");
		c.depositar(50);
		System.out.println(c.getSaldo());
	}

	
}
