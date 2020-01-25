package di.service;

import di.modelo.Cliente;
import di.modelo.Produto;
import di.notificacao.Notificador;

public class EmissaoNotafiscalService {
	
	private Notificador notificador; 

	public void ativacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal
			
		notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida");
	}
}
