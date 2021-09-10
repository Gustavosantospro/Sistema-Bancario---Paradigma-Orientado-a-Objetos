package br.com.caelum.contas;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorSeguroDeVida {

	SeguroDeVida SeguroDeVida;
	
	public void criaSeguro(Evento evento) {
		this.SeguroDeVida = new SeguroDeVida();
		this.SeguroDeVida.setNumApolic(evento.getInt("numApolic"));
		this.SeguroDeVida.setTitular(evento.getString("titular"));
		this.SeguroDeVida.setValor(evento.getDouble("valor"));
		
	}
}
